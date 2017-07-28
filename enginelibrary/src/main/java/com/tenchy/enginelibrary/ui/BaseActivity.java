package com.tenchy.enginelibrary.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.tenchy.enginelibrary.utils.ActivityUtils;

/**
 * Created by Administrator on 2017/7/27.
 */

public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityUtils.getInstance().addActivity(this);
    }




    @Override
    protected void onResume() {
        super.onResume();

        Log.i("info", this.getClass().getSimpleName() + "--->onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("info", this.getClass().getSimpleName() + "--->onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        MyApp.finishSingleActivity(this);
        Log.i("info", this.getClass().getSimpleName() + "被销毁!!!");


    }
}
