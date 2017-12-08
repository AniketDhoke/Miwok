package com.example.anike.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class color_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        final ArrayList<Main2Activity.Word> arrayList = new ArrayList<>();
        arrayList.add(new Main2Activity.Word("wetetti","red",R.mipmap.color_red));
        arrayList.add(new Main2Activity.Word("chokokki","green",R.mipmap.color_green));
        arrayList.add(new Main2Activity.Word("takaakki","brown",R.mipmap.color_brown));
        arrayList.add(new Main2Activity.Word("topoppi","gray",R.mipmap.color_gray));
        arrayList.add(new Main2Activity.Word("kululli","black",R.mipmap.color_black));
        arrayList.add(new Main2Activity.Word("kelelli","white",R.mipmap.color_white));
        arrayList.add(new Main2Activity.Word("topiise","dusty yellow",R.mipmap.color_dusty_yellow));
        arrayList.add(new Main2Activity.Word("chiwiite","mustard yellow",R.mipmap.color_mustard_yellow));

        MyAdapter2 myAdapter = new MyAdapter2(this,R.layout.activity_numbers,arrayList);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(myAdapter);
    }
}
