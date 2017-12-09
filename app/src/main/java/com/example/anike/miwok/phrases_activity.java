package com.example.anike.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class phrases_activity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);


        ArrayList<Main2Activity.Word> arrayList = new ArrayList<>();
        arrayList.add(new Main2Activity.Word("minto wuksus","Where are you going?"));
        arrayList.add(new Main2Activity.Word("tinne oyaasene?","What is your name?"));
        arrayList.add(new Main2Activity.Word("oyaaset","My name is.."));
        arrayList.add(new Main2Activity.Word("michekses?","How are you feeling?"));
        arrayList.add(new Main2Activity.Word("kuchi achit","I'm feeling good"));
        arrayList.add(new Main2Activity.Word("eenes'aa?","Are you coming"));
        arrayList.add(new Main2Activity.Word("hee'eenem","Yes,I'm coming"));
        arrayList.add(new Main2Activity.Word("eenem","I'm coming"));
        arrayList.add(new Main2Activity.Word("yoowutis","Let's go"));
        arrayList.add(new Main2Activity.Word("anni'nem","Come here"));

        MyAdapter1 myAdapter = new MyAdapter1(this,R.layout.activity_numbers,arrayList,R.color.phrases_activity);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(myAdapter);

    }
}
