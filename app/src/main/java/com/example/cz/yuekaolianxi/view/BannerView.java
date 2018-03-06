package com.example.cz.yuekaolianxi.view;

import com.example.cz.yuekaolianxi.bean.BannerBean;

/**
 * Created by CZ on 2018/3/6.
 */

public interface BannerView {
    public void success(BannerBean bean);

    public void failuer(String e);
}
