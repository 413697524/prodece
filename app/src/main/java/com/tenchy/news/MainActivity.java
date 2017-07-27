package com.tenchy.news;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.tenchy.enginelibrary.ui.BaseActivity;

import butterknife.BindView;


public class MainActivity extends BaseActivity {
    @BindView(R.id.hello)
    TextView hello;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hello.setText("jflkasj;fkadf");

    }

}
