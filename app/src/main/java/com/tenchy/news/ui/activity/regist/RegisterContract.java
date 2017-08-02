package com.tenchy.news.ui.activity.regist;

import com.tenchy.enginelibrary.contract.BaseContract;
import com.tenchy.news.NewsResult;

/**
 * Created by Administrator on 2017/7/28.
 */

public interface RegisterContract{
    interface View extends BaseContract.BaseView{

        void setContent(String contents);
    }

    interface Model extends BaseContract.BaseModel{

        NewsResult register();
    }


    interface Presenter extends BaseContract.BasePresenter{
        NewsResult register();

    }
}
