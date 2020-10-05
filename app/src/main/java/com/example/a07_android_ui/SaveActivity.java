package com.example.a07_android_ui;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
public class SaveActivity implements Parcelable {
    private String text1;
    private String text2;
    private String text3;
    protected SaveActivity(Parcel in) {
        text1 = in.readString();
        text2 = in.readString();
        text3 = in.readString();
    }
    public SaveActivity(String text1, String text2, String text3){
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
    }

    public static final Creator<SaveActivity> CREATOR = new Creator<SaveActivity>() {
        @Override
        public SaveActivity createFromParcel(Parcel in) {
            return new SaveActivity(in);
        }

        @Override
        public SaveActivity[] newArray(int size) {
            return new SaveActivity[size];
        }
    };

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public String getText3() {
        return text3;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(text1);
        parcel.writeString(text2);
        parcel.writeString(text3);
    }
}
