package com.tenchy.enginelibrary.contract;

import android.content.Context;

/**
 * Created by Administrator on 2017/7/28.
 */

public interface BaseContract {
    interface BaseModel{

    }

    interface BaseView{
        void showLoadingDialog();
        void closeLoadingDialog();

    }

    interface BasePresenter{
        void destory();
    }
}
