package com.tenchy.news.ui.activity.main;

import com.tenchy.enginelibrary.contract.BaseContract;

/**
 * Created by Administrator on 2017/7/31.
 */

public interface MainContract {
    interface View extends BaseContract.BaseView{
        void setAdapter();
    }
}
