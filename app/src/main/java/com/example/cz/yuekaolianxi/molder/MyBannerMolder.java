package com.example.cz.yuekaolianxi.molder;

import com.example.cz.yuekaolianxi.app.MyApp;
import com.example.cz.yuekaolianxi.bean.BannerBean;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by CZ on 2018/3/6.
 */

public class MyBannerMolder {
    public void get(final MyCallBack callBack) {
        MyApp.inters.getBanner()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<BannerBean>() {
                    @Override
                    public void accept(BannerBean bannerBean) throws Exception {
                        callBack.success(bannerBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        callBack.failuer(String.valueOf(throwable));
                    }
                });
    }
}
