package com.sing.mytest.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.sing.baselibrary.CheckNet;
import com.sing.baselibrary.OnClick;
import com.sing.baselibrary.ViewById;
import com.sing.baselibrary.ViewUtils;
import com.sing.mytest.R;

/**
 * Created by yy on 2019/9/10.
 * function:
 */
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.test_tv)
    private TextView mTestTv;

    private int mPage = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewUtils.inject(this);
        mTestTv.setText("yuyang");
    }

    @OnClick({R.id.test_tv, R.id.test_iv})
//    @OnClick( R.id.test_iv)
    @CheckNet  //美网就不执行该方法,而是直接打印没网的toast
    private void onClick(View view) {
        int i=2/1;//不会闪退,这里是不会崩溃的 这样有利于体验 但是测试调试比较麻烦
        //需要查看打印的警告
        Toast.makeText(this,"点击"+i,Toast.LENGTH_SHORT).show();
    }

}
