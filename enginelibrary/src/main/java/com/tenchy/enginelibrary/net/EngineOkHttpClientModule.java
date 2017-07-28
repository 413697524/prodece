package com.tenchy.enginelibrary.net;

import android.content.Context;

import com.tenchy.enginelibrary.BuildConfig;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by Administrator on 2017/7/27.
 */

@Module
public class EngineOkHttpClientModule {

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient(Context context, HttpLoggingInterceptor httpLoggingInterceptor, HttpInterceptor httpInterceptor) {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
//                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(httpLoggingInterceptor)
//                .addInterceptor(new GetCookiesInterceptor(context))
                .addInterceptor(httpInterceptor)
                .build();

        return client;
    }

    @Provides
    @Singleton
    public HttpInterceptor provideHttpInterceptor(Context context){
        return new HttpInterceptor(context);
    }

    @Provides
    @Singleton
    public HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        if (BuildConfig.DEBUG) {
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        } else {
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
        }
        return httpLoggingInterceptor;
    }



}
