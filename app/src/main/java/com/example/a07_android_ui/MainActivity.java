package com.example.a07_android_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

import static android.icu.lang.UCharacter.JoiningType.TRANSPARENT;

public class MainActivity extends AppCompatActivity implements Parcelable {
    public static final String TAG="MainActivity";
    private EditText mDisplayData;
    private Button savebtn, savebtn2;
    private EditText text1, text2, text3;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    public static final Creator<MainActivity> CREATOR = new Creator<MainActivity>() {
        @Override
        public MainActivity createFromParcel(Parcel in) {
            return new MainActivity(in);
        }

        @Override
        public MainActivity[] newArray(int size) {
            return new MainActivity[size];
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDisplayData=(EditText) findViewById(R.id.date);

        mDisplayData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        MainActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year, month, day
                );
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month+1;
                Log.d(TAG, "onDataSet: dd/mm/yyyy: "+day+"/"+month+"/"+year);
                String mydate = day+"/"+month+"/"+year;
                mDisplayData.setText(mydate);
            }
        };

        MainActivity2 main2 = new MainActivity2();
        savebtn = findViewById(R.id.saveintent);
        text1 = findViewById(R.id.name);
        text2 = findViewById(R.id.nim);
        text3 = findViewById(R.id.date);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("text1", text1.getText().toString());
                intent.putExtra("text2", text2.getText().toString());
                intent.putExtra("text3", text3.getText().toString());
                startActivity(intent);
            }
        });

        savebtn2 = findViewById(R.id.saveparcelable);

    }

    protected MainActivity(Parcel in) {
        
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}