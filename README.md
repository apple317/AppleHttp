## 前言

  博主最近分享了网络组件，完美适配Retrofit写法，本库目标会实现java、kotlin网络那个自由
切换okhttp、volley、async等，目前已实现java版本okhttp，然后会抽离工厂模式兼容实现
volley。

- [Kotlin Android 扩展](https://www.kotlincn.net/docs/tutorials/android-plugin.html)是一个编译器扩展， 可以让你摆脱代码中的 `findViewById()` 调用，并将其替换为合成的编译器生成的属性。
- [Anko](http://github.com/kotlin/anko) 是一个提供围绕 Android API 的 Kotlin 友好的包装器的库 ，以及一个可以用 Kotlin 代码替换布局 .xml 文件的 DSL。


###kotlin版本
```

```

###java版本
```
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
}

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
```
## 更新日志

**v1.0**

 - 

## 关于我

 - Email: 513888967@qq.com hushaoping518@gmail.com
 - CSDN:[https://blog.csdn.net/Apple_hsp](https://blog.csdn.net/Apple_hsp)

## Thanks

- 感谢所有优秀的开源项目

## 声明

## LICENSE

```
Copyright 2020 applehsp

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

