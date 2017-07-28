package com.tenchy.enginelibrary.net;



import com.tenchy.enginelibrary.BuildConfig;

import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by Administrator on 2017/7/28.
 */

public class LogsInterceptor  {


    /**
     * 日志打印
     * @return httpLoggingInterceptor
     */
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
