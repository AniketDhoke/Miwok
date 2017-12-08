package com.example.anike.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by anike on 08-12-2017.
 */

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
    }

public static class Word1 {

        private String mDefaultLang;
        private  String mMiwokLang;

    public Word1(String mDefaultLang, String mMiwokLang) {
        this.mDefaultLang = mDefaultLang;
        this.mMiwokLang = mMiwokLang;
    }

    public String getmDefaultLang() {
        return mDefaultLang;
    }

    public void setmDefaultLang(String mDefaultLang) {
        this.mDefaultLang = mDefaultLang;
    }

    public String getmMiwokLang() {
        return mMiwokLang;
    }

    public void setmMiwokLang(String mMiwokLang) {
        this.mMiwokLang = mMiwokLang;
    }
}
}
