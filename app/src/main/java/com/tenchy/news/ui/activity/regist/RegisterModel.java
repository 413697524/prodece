package com.tenchy.news.ui.activity.regist;


import com.tenchy.news.MyApp;
import com.tenchy.news.NewsResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/7/28.
 *
 * model层只负责数据的获取
 */

public class RegisterModel implements RegisterContract.Model {
    /**
     * 请求api获取数据
     *
     * @return
     */
    @Override
    public NewsResult register() {
//        MyApp.getAppComponent().getApiService().signup(new RegisterReqBean()).enqueue(new Callback<RegisterResultBean>() {
//            @Override
//            public void onResponse(Call<RegisterResultBean> call, Response<RegisterResultBean> response) {
//                RegisterResultBean body = response.body();
//                int status = body.getStatus();
//
//                if (status == 0){
//
//                }else {
//
//                }
//            }
//
//            @Override
//            public void onFailure(Call<RegisterResultBean> call, Throwable t) {
//
//            }
//        });
        NewsResult result = new NewsResult();
        result.setMessageNum("101");
        result.setMsg("殊不知破");
        result.setStatus(0);
        result.setData(null);
        return result;
    }
}
