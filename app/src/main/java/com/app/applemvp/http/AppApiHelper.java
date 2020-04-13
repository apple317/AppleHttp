package com.app.applemvp.http;


import android.app.Application;
import android.content.Context;

import com.base.applehttp.common.ApiHelper;
import com.base.applehttp.common.BaseHttpClient;
import com.base.applehttp.common.HttpConfiguration;
import com.base.applehttp.cookie.okhttp.CookieJarImpl;
import com.base.applehttp.cookie.okhttp.PersistentCookieStore;
import com.base.applehttp.impl.okhttp.OkHttpImpl;
import com.base.applehttp.listener.error.AppException;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by SeanLiu on 17/6/16.
 */
public class AppApiHelper extends ApiHelper {


    public OkHttpImpl baseHttp;

    public Context mContext;

    public AppApiHelper(Context context) {
        mContext = context;
        baseHttp = getOkHttpImpl();
    }

    public ApiService createApiService() {
        return baseHttp.createApi(ApiService.class);
    }


    @Override
    public void initHttp(Application context, String path) {
        HttpConfiguration.Builder configuration = new HttpConfiguration.Builder(context);
        configuration.retryOnConnectionFailure(true);
        configuration.diskCacheSize(10 * 1024 * 1024);
        configuration.setBaseUrl(path);
        configuration.setCookieJar(new CookieJarImpl(new PersistentCookieStore(context)));
        configuration.diskCacheDir(context.getCacheDir());
        BaseHttpClient baseHttpClient = BaseHttpClient.getBaseClient();
        baseHttpClient.init(configuration.build());
    }



    public <T> ObservableTransformer<T, T> handleResult() {
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(Observable<T> upstream) {
                return upstream.flatMap((Function<T, ObservableSource<T>>) result -> {
                    if (result instanceof BaseResultEntity) {
                        BaseResultEntity<T> resultEntity = (BaseResultEntity<T>) result;
                        if (resultEntity.getCode() == 200) {
                            return createData(result);
                        } else {
                            return Observable.error(new AppException(resultEntity.getMessage(), resultEntity.getCode()));
                        }
                    } else {
                        return createData(result);
                    }
                }).subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }


    public ApiService createApiService(String baseUrl) {
        return baseHttp.createApi(baseUrl, ApiService.class);
    }


}
