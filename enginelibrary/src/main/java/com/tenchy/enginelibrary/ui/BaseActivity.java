package com.tenchy.enginelibrary.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/7/27.
 */

public abstract class BaseActivity extends AppCompatActivity {
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
}
