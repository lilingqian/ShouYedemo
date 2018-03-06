package com.example.cz.yuekaolianxi.persenter;

import com.example.cz.yuekaolianxi.bean.BannerBean;
import com.example.cz.yuekaolianxi.molder.MyBannerMolder;
import com.example.cz.yuekaolianxi.molder.MyCallBack;
import com.example.cz.yuekaolianxi.view.BannerView;

/**
 * Created by CZ on 2018/3/6.
 */

public class BannerPersenter {
    BannerView view;
    private final MyBannerMolder molder;

    public BannerPersenter(BannerView view) {
        this.view = view;
        molder = new MyBannerMolder();
    }

    public void getData() {
        molder.get(new MyCallBack() {
            @Override
            public void success(BannerBean bean) {
                if (view != null) {
                    view.success(bean);
                }
            }

            @Override
            public void failuer(String e) {
                if (view != null) {
                    view.failuer(e);
                }
            }
        });
    }

    public void banner() {
        this.view = null;
    }
}
