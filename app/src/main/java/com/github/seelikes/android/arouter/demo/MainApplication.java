package com.github.seelikes.android.arouter.demo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.github.seelikes.android.log.SaLog;
import com.github.seelikes.android.log.SaLogConstants;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        SaLogConstants.setLogLevel(BuildConfig.DEBUG ? SaLogConstants.VERBOSE : SaLogConstants.ERROR);

        SaLog.i(MainApplication.class, "onCreate.UL7890LP.DI1211", "enter.");

        if (BuildConfig.DEBUG) {
            ARouter.openDebug();
            ARouter.openLog();
        }

        ARouter.init(this);
    }
}
