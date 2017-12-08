package com.example.anike.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
    }


    public static class Word {

        private String mDefaultLang;
        private String miwokLang;
        private int mImageResources;

        public Word(String mDefaultLang, String miwokLang, int mImageResources) {
            this.mDefaultLang = mDefaultLang;
            this.miwokLang = miwokLang;
            this.mImageResources = mImageResources;
        }

        public String getmDefaultLang() {
            return mDefaultLang;
        }

        public void setmDefaultLang(String mDefaultLang) {
            this.mDefaultLang = mDefaultLang;
        }

        public String getMiwokLang() {
            return miwokLang;
        }

        public void setMiwokLang(String miwokLang) {
            this.miwokLang = miwokLang;
        }

        public int getmImageResources() {
            return mImageResources;
        }

        public void setmImageResources(int mImageResources) {
            this.mImageResources = mImageResources;
        }
    }
}
