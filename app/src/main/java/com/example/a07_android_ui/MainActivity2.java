package com.example.a07_android_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private String s1;
    private String s2;
    private String s3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text1 = (TextView) findViewById(R.id.textView);
        text2 = (TextView) findViewById(R.id.textView2);
        text3 = (TextView) findViewById(R.id.textView3);
        String str1 = getIntent().getExtras().getString("text1");
        String str2 = getIntent().getExtras().getString("text2");
        String str3 = getIntent().getExtras().getString("text3");
        text1.setText(str1);
        text2.setText(str2);
        text3.setText(str3);

//        ===================parcelable======================
        Intent intent = getIntent();
        SaveActivity save = intent.getParcelableExtra("parcel");
//
        text1.setText(save.getText1());
        text2.setText(save.getText2());
        text3.setText(save.getText3());
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }
}