package com.xushuai.exception;

import android.app.Application;
import android.content.Context;

/**
 * 注册全局异常捕获处理器
 * Created xushuai on 2017/8/21.
 */
public class AppApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        this.mContext = this;
        CrashHandler.getInstance().init(this);//初始化全局异常管理
    }

    public static Context getContext() {
        return mContext;
    }
}