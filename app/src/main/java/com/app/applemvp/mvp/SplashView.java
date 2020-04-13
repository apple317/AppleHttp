package com.app.applemvp.mvp;

import com.app.applemvp.http.RankingEntity;
import com.base.applemvp.common.IBaseView;

import java.util.List;

/**
 * applehsp  on 2018/4/25.
 */

public interface SplashView extends IBaseView {
    void advertList(List<RankingEntity> rankingEntities);
}
