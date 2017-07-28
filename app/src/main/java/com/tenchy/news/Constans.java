package com.tenchy.news;

/**
 * Created by Administrator on 2017/7/28.
 */

public interface Constans {
    /**
     * 测试环境 1
     */
    String HOST_DEV = "http://172.16.81.88";
    String SERVER_DEV = "";
    String DEVELOP = HOST_DEV+SERVER_DEV;

    /**
     * 生产环境 0
     */
    String HOST_PRO= "";
    String SERVER_PRO = "";
    String PRODUCE  = HOST_PRO+SERVER_PRO;

    int TYPE = 1;
//    int TYPE = "0";

}
