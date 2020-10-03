package com.example.a07_android_ui;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
public class SaveActivity extends AppCompatActivity{
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        text1 = findViewById(R.id.textView);
        text2 = findViewById(R.id.textView2);
        text3 = findViewById(R.id.textView3);
        text4 = findViewById(R.id.textView4);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save_page);
    }
}
