package com.example.a07_android_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
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
    }

    public TextView getText1() {
        return text1;
    }

    public TextView getText2() {
        return text2;
    }

    public TextView getText3() {
        return text3;
    }

    public TextView getText4() {
        return text4;
    }
}