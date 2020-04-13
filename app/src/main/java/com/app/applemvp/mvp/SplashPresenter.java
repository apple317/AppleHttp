package com.app.applemvp.mvp;


import com.app.applemvp.AppleApplication;
import com.app.applemvp.http.AppApiHelper;
import com.app.applemvp.http.BaseResultEntity;
import com.app.applemvp.http.RankingEntity;
import com.base.applehttp.listener.error.HttpException;
import com.base.applehttp.rxjava.RxResSubscriber;
import com.base.applemvp.common.BasePresenter;

import java.util.HashMap;
import java.util.List;


/**
 * applehsp  on 2018/5/17.
 */

public class SplashPresenter extends BasePresenter<SplashView> {

    private AppApiHelper appApiHelper;


    public SplashPresenter() {
        appApiHelper= AppleApplication.getApiHelper();
    }


    /**
     * 广告方法
     */
    public void advertList() {
        HashMap body = new HashMap();
        body.put("type", "1");
        appApiHelper.createApiService().otherCategory(body)
                .compose(appApiHelper.handleResult())
                .compose(getView().bindLifeycle(false))
                .subscribe(new RxResSubscriber<BaseResultEntity<List<RankingEntity>>>() {
                    @Override
                    public void onError(HttpException exception) {
                        getView().hideProgress();
                        getView().advertList( null);
                    }

                    @Override
                    public void onNextData(BaseResultEntity<List<RankingEntity>> inputPhoneEntity) {
                        getView().hideProgress();
                        getView().advertList( inputPhoneEntity.getResult());
                    }
                });
    }

}
