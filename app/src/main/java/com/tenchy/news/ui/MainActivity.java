package com.tenchy.news.ui;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.tenchy.news.base.BusinessActivity;
import com.tenchy.news.R;
import com.tenchy.news.ui.activity.login.MyLoginActivity;

import butterknife.BindView;


public class MainActivity extends BusinessActivity {
    @BindView(R.id.hello)
    TextView hello;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hello.setText("fffffffffffs");

    }

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inetent = new Intent(MainActivity.this,MyLoginActivity.class);
                startActivity(inetent);
            }
        });



    }

}
