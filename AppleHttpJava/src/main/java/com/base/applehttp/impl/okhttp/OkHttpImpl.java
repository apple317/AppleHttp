package com.base.applehttp.impl.okhttp;


import com.base.applehttp.common.HttpConfiguration;
import com.base.applehttp.common.SSLSocketClient;
import com.base.applehttp.converter.gson.GsonConverterFactory;
import com.base.applehttp.impl.BaseHttpImpl;
import com.base.applehttp.log.HttpLoggingInterceptor;
import com.base.applehttp.retrofit.Retrofit;
import com.base.applehttp.rxjava.RxJava2CallAdapterFactory;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;


/**
 * AsyncHttpClient async网络申请实现类
 * 如果有新网络tcp请求，就要重新实现一个网络交互类
 * <p>
 * OkHttpImpl such is the package okhttp network library independent implementation module,
 * in such a network data request.
 *
 * @author applehsp
 */


public class OkHttpImpl implements BaseHttpImpl {

    //单例模式实现
    public OkHttpClient mOkHttpClient;
    public static OkHttpImpl instance;


    public Retrofit retrofit;

    public static OkHttpImpl getOkClient(OkHttpClient okHttpClient) {
        if (instance == null) {
            synchronized (OkHttpImpl.class) {
                if (instance == null) {
                    instance = new OkHttpImpl(okHttpClient);
                }
            }
        } else {
            if (okHttpClient != null) {
                instance.mOkHttpClient = okHttpClient;
            }
        }
        return instance;
    }


    @Override
    public void init(HttpConfiguration configuration) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(configuration.getConnectTimeout(), TimeUnit.SECONDS);
        builder.readTimeout(configuration.getReadTimeout(), TimeUnit.SECONDS);
        builder.writeTimeout(configuration.getWriteTimeout(), TimeUnit.SECONDS);
        if (configuration.getCacheDir() != null && configuration.getCacheDir().isDirectory()) {
            Cache cache = new Cache(configuration.getCacheDir(), configuration.getDiskCacheSize());
            builder.cache(cache);
        }
        if (configuration.getCookieJar() != null)
            builder.cookieJar(configuration.getCookieJar());

        if (configuration.getCertificates() != null)
            builder.sslSocketFactory(configuration.getCertificates());
        builder.retryOnConnectionFailure(configuration.isRetryOnConnectionFailure());
        builder.hostnameVerifier(SSLSocketClient.getHostnameVerifier());
        builder.protocols(Collections.singletonList(Protocol.HTTP_1_1));
        builder.sslSocketFactory(SSLSocketClient.getSSLSocketFactory());
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        if (configuration.getNetworkInterceptor() != null)
            builder.addInterceptor(configuration.getNetworkInterceptor());
        builder.addInterceptor(loggingInterceptor);
        mOkHttpClient = builder.build();
        retrofit = new Retrofit.Builder()
                .client(mOkHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(configuration.getBaseUrl())
                .build();
    }


    public static OkHttpImpl getOkClient() {
        if (instance == null) {
            synchronized (OkHttpImpl.class) {
                if (instance == null) {
                    instance = new OkHttpImpl(null);
                }
            }
        }
        return instance;
    }

    public OkHttpImpl(OkHttpClient okHttpClient) {
        if (okHttpClient != null) {
            mOkHttpClient = okHttpClient;
        }
    }


    /**
     * 创建公共api对象
     *
     * @param service
     * @param <T>
     * @return
     */
    public <T> T createApi(final Class<T> service) {
        return retrofit.create(service);
    }


    /**
     * 创建api
     *
     * @param baseUrl
     * @param service
     * @param <T>
     * @return
     */
    public <T> T createApi(String baseUrl, final Class<T> service) {
        Retrofit retrofit = new Retrofit.Builder()
                .client(mOkHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(baseUrl)
                .build();
        return retrofit.create(service);
    }


}
