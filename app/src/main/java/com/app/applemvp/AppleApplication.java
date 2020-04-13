package com.app.applemvp;


import com.app.applemvp.http.AppApiHelper;
import com.base.applemvp.common.BaseApplication;


public class AppleApplication extends BaseApplication {


    public static AppApiHelper apiHelper;


    public static AppApiHelper getApiHelper() {
        return apiHelper;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        apiHelper = new AppApiHelper(getApplicationContext());
        apiHelper.initHttp(this, "https://api.apiopen.top/");
    }


}
