package com.tenchy.news.net;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.tenchy.news.Constans;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/7/28.
 */

@Module
public class RetrofitModule {

    @Singleton
    @Provides
    public Api provideApiService(OkHttpClient okHttpClient){
        Retrofit retrofitBuilder = new Retrofit.Builder()
                .baseUrl(Constans.DEVELOP)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api apiService = retrofitBuilder.create(Api.class);
        return apiService;

    }



}
