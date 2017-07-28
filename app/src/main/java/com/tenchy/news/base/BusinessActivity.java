package com.tenchy.news.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.tenchy.enginelibrary.ui.BaseActivity;
import com.tenchy.news.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/7/27.
 */

public abstract class BusinessActivity extends BaseActivity {
    private Unbinder unbind;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResID());
        unbind = ButterKnife.bind(this);
        initView();

    }

    /**
     * 获取布局文件id
     * @return
     */
    protected abstract int getLayoutResID();

    /**
     * 初始化view数据
     */
    protected abstract void initView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbind.unbind();
    }


    /**
     * 为开启新的activity添加淡入淡出的动画
     */
    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
//        if (this instanceof MainActivity) {
//            overridePendingTransition(R.anim.zoomin, R.anim.zoomout);//中间放大
        overridePendingTransition(R.anim.tran_next_in, R.anim.tran_next_out);//左右进入
//        } else {
//            overridePendingTransition(R.anim.zoomin, R.anim.zoomout);//中间放大
//
//        }
    }


    /**
     * 为关闭当前activity添加淡入淡出的动画
     */
    @Override
    public void finish() {
        super.finish();
//        if (this instanceof MainActivity ||this instanceof ImageShower) {
//            overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
//        } else {
//        }
            overridePendingTransition(R.anim.tran_pre_in, R.anim.tran_pre_out);
    }

    /**
     * 为开启新的activity添加淡入淡出的动画
     */
    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);

        // overridePendingTransition(R.anim.zoomin, R.anim.zoomout);

        overridePendingTransition(R.anim.tran_next_in, R.anim.tran_next_out);
    }

    /**
     * 通过Class开启activity
     *
     * @param cls
     */
    public void startActivity(Class<?> cls) {
        startActivity(cls, null);
    }

    /**
     * 通过Class开启activity，并且传递bundle数据
     *
     * @param cls
     * @param bundle
     */
    public void startActivity(Class<?> cls, Bundle bundle) {
        Intent intent = new Intent();
        intent.setClass(this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    /**
     * 通过action开启activity
     *
     * @param action
     */
    public void startActivity(String action) {
        startActivity(action, null);
    }

    /**
     * 通过action开启activity，并且传递bundle数据
     *
     * @param action
     * @param bundle
     */
    public void startActivity(String action, Bundle bundle) {
        Intent intent = new Intent();
        intent.setAction(action);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }
}
