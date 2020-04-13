package com.app.applemvp.http;


import com.base.applehttp.api.GET;
import com.base.applehttp.api.QueryMap;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;


public interface ApiService {

    @GET(HttpURL.otherCategory)
    Observable<BaseResultEntity<List<RankingEntity>>> otherCategory(@QueryMap Map<String, String> headMap);

}
