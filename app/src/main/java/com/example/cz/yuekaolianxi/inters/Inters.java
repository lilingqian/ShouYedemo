package com.example.cz.yuekaolianxi.inters;

import com.example.cz.yuekaolianxi.bean.BannerBean;


import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by CZ on 2018/3/6.
 */

public interface Inters {
    //https://www.zhaoapi.cn/ad/getAd
    @GET("ad/getAd")
    Observable<BannerBean> getBanner();

    //@GET()

}
