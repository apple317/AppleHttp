package com.base.applehttp.common;

import android.app.Application;

import com.base.applehttp.impl.okhttp.OkHttpImpl;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public abstract class ApiHelper {

    public abstract void initHttp(Application context, String path);

    public OkHttpImpl getOkHttpImpl() {
        return BaseHttpClient.getBaseClient().getHttpImpl();
    }

    /**
     * 创建成功的数据
     *
     * @param data
     * @param <T>
     * @return
     */
    public  <T> Observable<T> createData(final T data) {
        return Observable.create(new ObservableOnSubscribe<T>() {
            @Override
            public void subscribe(ObservableEmitter<T> emitter) throws Exception {
                try {
                    emitter.onNext(data);
                } catch (Exception e) {
                    emitter.onError(e);
                }
            }
        });
    }

    public RequestBody filesToMultipartBody(String fileParams, List<File> files, HashMap<String, String> body) {
        MultipartBody.Builder builder = new MultipartBody.Builder();
        for (File file : files) {
            // TODO: 16-4-2  这里为了简单起见，没有判断file的类型
            RequestBody requestBody = RequestBody.create(MediaType.parse("image/png"), file);
            builder.addFormDataPart(fileParams, file.getName(), requestBody);
        }
        for (String key : body.keySet()) {
            builder.addFormDataPart(key, body.get(key));
        }
        builder.setType(MultipartBody.FORM);
        RequestBody multipartBody = builder.build();
        return multipartBody;
    }

}
