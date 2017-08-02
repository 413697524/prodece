package com.tenchy.news.ui.activity.regist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

import com.tenchy.news.R;
import com.tenchy.news.base.BusinessActivity;

import butterknife.BindView;

/**
 * Created by Administrator on 2017/7/28.
 */

public class RegisterActivity extends BusinessActivity implements RegisterContract.View {

    @BindView(R.id.content)
    TextView content;
    private RegisterPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        presenter = new RegisterPresenter(this);
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_register;
    }

    @Override
    protected void initView() {
        //注册
        presenter.register();

    }

    @Override
    public void showLoadingDialog() {
        Toast.makeText(this, "showloadingDialog", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void closeLoadingDialog() {
        Toast.makeText(this, "closeLoadingDialog", Toast.LENGTH_SHORT).show();

    }


    @Override
    public void setContent(String contents) {
        content.setText(contents);
    }
}
