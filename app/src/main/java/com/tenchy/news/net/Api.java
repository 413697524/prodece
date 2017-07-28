package com.tenchy.news.net;

import com.tenchy.news.ui.activity.regist.RegisterReqBean;
import com.tenchy.news.ui.activity.regist.RegisterResultBean;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2017/7/28.
 */

public interface Api {
    @POST("rest/V1/MobileRest/signup")
    Call<RegisterResultBean> signup(@Body RegisterReqBean data);
}
