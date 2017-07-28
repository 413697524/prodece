package com.tenchy.news;

import android.content.Context;


import com.tenchy.enginelibrary.net.EngineOkHttpClientModule;
import com.tenchy.enginelibrary.net.HttpInterceptor;
import com.tenchy.news.net.Api;
import com.tenchy.news.net.RetrofitModule;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by Administrator on 2017/1/17.
 *
 */

@Singleton
@Component(modules = {ApplicationModule.class,EngineOkHttpClientModule.class, RetrofitModule.class})
public interface AppComponent {
    // inject what
//    void inject(TestBaseActivity activity);

    Context getContext();
    OkHttpClient getOkHttpClient();
    HttpInterceptor HttpInterceptor();
    HttpLoggingInterceptor HttpLoggingInterceptor();
    Api getApiService();


//
//    SpfManager getSpfManager();
//    DBManager getDbManager();
//    FrescoImageLoader getImageLoader();
//    MyActivityUtils getActivityManager();




}
