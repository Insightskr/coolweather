package com.coolweather.android;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * Created by blue on 2017/2/12.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        context=getApplicationContext();
        LitePal.initialize(context);
    }

    public static Context getContext(){
        return context;
    }
}
