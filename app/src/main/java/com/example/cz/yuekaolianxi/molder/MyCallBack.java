package com.example.cz.yuekaolianxi.molder;

import com.example.cz.yuekaolianxi.bean.BannerBean;

/**
 * Created by CZ on 2018/3/6.
 */

public interface MyCallBack {
    public void success(BannerBean bean);

    public void failuer(String e);
}
