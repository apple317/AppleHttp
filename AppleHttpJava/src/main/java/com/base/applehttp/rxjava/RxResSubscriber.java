package com.base.applehttp.rxjava;

import com.base.applehttp.listener.error.FactoryException;
import com.base.applehttp.listener.error.HttpException;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


/**
 * des:订阅封装
 * Created by xsf
 * on 2016.09.10:16
 */

/********************使用例子********************/
public  class RxResSubscriber<T> implements Observer<T> {


    public RxResSubscriber() {
    }




    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
        onError(FactoryException.analysisExcetpion(e));
    }



    @Override
    public void onNext(T tBaseEntity) {
        onNextData(tBaseEntity);
    }

    public void onNextData(T t){

    }




    @Override
    public void onComplete() {

    }

    public void onError(HttpException exception){

    }

    @Override
    public void onSubscribe(Disposable d) {

    }
}
