package com.tenchy.news;

import android.app.Application;

import com.tenchy.enginelibrary.net.EngineOkHttpClientModule;

/**
 * Created by Administrator on 2017/7/28.
 */

public class MyApp extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .engineOkHttpClientModule(new EngineOkHttpClientModule())
                .build();
    }

    public static AppComponent getAppComponent(){
        return appComponent;
    }
}
