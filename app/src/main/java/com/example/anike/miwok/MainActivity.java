package com.example.anike.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textText1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,numbers_activity.class);
                startActivity(intent);
            }
        });

        TextView textView1 = (TextView) findViewById(R.id.textText2);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,family_activity.class);
                startActivity(intent);
            }
        });

        TextView textView2 = (TextView) findViewById(R.id.textText3);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,color_activity.class);
                startActivity(intent);
            }
        });

        TextView textView3 = (TextView) findViewById(R.id.textText4);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,phrases_activity.class);
                startActivity(intent);
            }
        });


    }
}
