package com.app.applemvp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.app.applemvp.http.RankingEntity;
import com.app.applemvp.mvp.MainPresenter;
import com.app.applemvp.mvp.MainView;
import com.app.applemvp.mvp.SplashPresenter;
import com.app.applemvp.mvp.SplashView;
import com.base.applemvp.annotations.CreatePresenterAnnotation;
import com.base.applemvp.common.BaseMvpActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends BaseMvpActivity implements SplashView, MainView {


    @BindView(R.id.btnSync)
    Button btnSync;
    @BindView(R.id.btnAdvert)
    Button btnAdvert;


    @CreatePresenterAnnotation(SplashPresenter.class)
    SplashPresenter splashPresenter;

    @CreatePresenterAnnotation(MainPresenter.class)
    MainPresenter mainPresenter;
    @BindView(R.id.iv_img)
    ImageView ivImg;

    @Override
    public int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        ButterKnife.bind(this);
    }

    @Override
    public void appSync(String msg) {
        btnSync.setText(msg);
    }

    @Override
    public void advertList(List<RankingEntity> advert) {
        try{
            if(advert.size()>0){
                Glide.with(this)
                        .load(advert.get(0).getAlbum_1000_1000())
                        .apply(
                                new RequestOptions()
                                        .dontAnimate()
                                        .skipMemoryCache(true)
                                        .skipMemoryCache(false)
                                        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC))
                        .into(ivImg);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }


    @OnClick({R.id.btnSync, R.id.btnAdvert})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnSync:
                mainPresenter.appSync("首页初始化");
                break;
            case R.id.btnAdvert:
                splashPresenter.advertList();
                break;
        }
    }


}
