package com.example.anike.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class family_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        final ArrayList<Main2Activity.Word> arrayList = new ArrayList<>();
        arrayList.add(new Main2Activity.Word("epe","father",R.mipmap.family_father));
        arrayList.add(new Main2Activity.Word("eta","mother",R.mipmap.family_mother));
        arrayList.add(new Main2Activity.Word("angsi","son",R.mipmap.family_son));
        arrayList.add(new Main2Activity.Word("tune","daughter",R.mipmap.family_daughter));
        arrayList.add(new Main2Activity.Word("taachi","older brother",R.mipmap.family_older_brother));
        arrayList.add(new Main2Activity.Word("chalitti","younger brother",R.mipmap.family_younger_brother));
        arrayList.add(new Main2Activity.Word("tete","older sister",R.mipmap.family_older_sister));
        arrayList.add(new Main2Activity.Word("kolliti","younger sister",R.mipmap.family_younger_sister));
        arrayList.add(new Main2Activity.Word("ama","grandmother",R.mipmap.family_grandmother));
        arrayList.add(new Main2Activity.Word("pappa","grandfather",R.mipmap.family_grandfather));

        MyAdapter3 myAdapter = new MyAdapter3(this,R.layout.activity_family,arrayList);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(myAdapter);

    }
}
