package com.sing.mytest.annotationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.sing.mytest.R;

public class AnnotationActivity extends AppCompatActivity {


    @BindValue("李四")
    private String name;

    private TextView tvName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annotation);
        BindValueProcessor.bind(this);
        tvName = findViewById(R.id.tvName);
        tvName.setText(name);
    }
}
