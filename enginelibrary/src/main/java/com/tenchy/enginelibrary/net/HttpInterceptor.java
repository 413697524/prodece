package com.tenchy.enginelibrary.net;

import android.content.Context;
import android.content.SharedPreferences;


import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;


/**
 * Created by Administrator on 2017/2/21.
 */

public class HttpInterceptor implements Interceptor {
    private Context context;

    public HttpInterceptor(Context context) {
        this.context = context;
    }


    /**
     * 主要设置请求的信息
     * @param chain
     * @return
     * @throws IOException
     */
    @Override
    public Response intercept(Chain chain) throws IOException {
        //设置请求头
        SharedPreferences sharedPreferences = context.getSharedPreferences("",Context.MODE_PRIVATE);
//        SharedPreferences sharedPreferences = MyApp.getAppComponent().getSpfManager().getCookieSp();

        SharedPreferences.Editor editor = sharedPreferences.edit();
        String cookie = sharedPreferences.getString("cookie", "");
        long cookie_time = sharedPreferences.getLong("cookie_time", 0);
        long currentTime = System.currentTimeMillis();
        long time = currentTime - cookie_time;
        long maxTime = 1000*60*60*24*3;

        //请求签判断
        Request request = chain.request();
        Response response;
        if (!cookie.equals("")) {
            Request.Builder compressedRequest = request.newBuilder();
            compressedRequest.header("Content-type","application/json; charset=UTF-8");
            if (0 < time && time < maxTime ){
                compressedRequest.header("cookie", cookie.substring(0,cookie.length()-1));
            }
            response = chain.proceed(compressedRequest.build());
        }else{
            response = chain.proceed(request);
        }
        return response;
    }


}
