package com.tenchy.news;

import android.content.Context;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2017/1/17.
 *
 */
@Module
public class ApplicationModule {
    private  final Context mContext;
    public ApplicationModule(Context mContext) {
        this.mContext = mContext;
    }

    @Provides
    @Singleton
    Context providesApplicationContext() {
        return this.mContext;
    }

//    @Provides
//    @Singleton
//    SpfManager provideSpfManager(Context context) {return new SpfManager(context);
//    }
//
//    @Provides
//    @Singleton
//    DBManager provideDBManager(Context context) {
//        return new DBManager(context);
//    }
//
//
//    @Provides
//    @Singleton
//    MyActivityUtils provideActivityUtils(Context context){
//        return new MyActivityUtils(context);
//    }
//
//    @Provides
//    @Singleton
//    FrescoImageLoader provideFresco(Context context, OkHttpClient client){
//        return new FrescoImageLoader(context,client);
//    }





}
