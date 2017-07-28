//package com.tenchy.enginelibrary.net;
//
//import android.content.Context;
//import android.content.SharedPreferences;
//import android.support.annotation.NonNull;
//
//import java.io.IOException;
//import java.util.function.Function;
//
//import okhttp3.Interceptor;
//import okhttp3.Response;
//import rx.Observable;
//import rx.Observer;
//
//
///**
// * Created by Administrator on 2017/2/21.
// */
//
//public class GetCookiesInterceptor implements Interceptor {
//    private Context context;
//
//    public GetCookiesInterceptor(Context context) {
//        super();
//        this.context = context;
//    }
//
//    @Override
//    public Response intercept(Chain chain) throws IOException {
//        SharedPreferences sharedPreferences = context.getSharedPreferences("",Context.MODE_PRIVATE);
////        SharedPreferences sharedPreferences = context.getSharedPreferences("cookie", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putLong("cookie_time", System.currentTimeMillis());
//        //设置cookie
//        Response originalResponse = chain.proceed(chain.request());
//        //如果是登陆则不设置cookie 而是更新cookie时间
//        if (chain.request().url().toString().equals(Constans.DEVELOP + "rest/V1/MobileRest/login")) {
//            return originalResponse;
//        }
//
//        if (!originalResponse.headers("Set-Cookie").isEmpty()) {
//            final StringBuffer cookieBuffer = new StringBuffer();
//
//            Observable.just(originalResponse.header("Set-Cookie"))
//                    .map(new Function<String, String>() {
//                        @Override
//                        public String apply(@NonNull String s) throws Exception {
//                            String[] cookieArray = s.split(";");
//                            return cookieArray[0];
//                        }
//                    })
//                    .subscribe(new Observer<String>() {
//                        @Override
//                        public void onSubscribe(Disposable d) {
//
//                        }
//
//                        @Override
//                        public void onNext(String s) {
//                            cookieBuffer.append(s).append(";");
//
//                        }
//
//                        @Override
//                        public void onError(Throwable e) {
//
//                        }
//
//                        @Override
//                        public void onComplete() {
//
//                        }
//                    });
//            editor.putString("cookie", cookieBuffer.toString());
//            editor.commit();
//
////            Observable.from(originalResponse.headers("Set-Cookie"))
////                    .map(new Func1<String, String>() {
////                        @Override
////                        public String call(String s) {
////                            String[] cookieArray = s.split(";");
////                            return cookieArray[0];
////                        }
////                    })
////                    .subscribe(new Action1<String>() {
////                        @Override
////                        public void call(String cookie) {
////                            cookieBuffer.append(cookie).append(";");
////                        }
////                    });
////            editor.putString("cookie", cookieBuffer.toString());
//        }
//
////        L.e("-------------------"+sharedPreferences.getString("cookie_time",""));
//        return originalResponse;
//    }
//}
