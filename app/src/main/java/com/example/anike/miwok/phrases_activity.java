package com.example.anike.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class phrases_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);


        ArrayList<Phrases.Word1> arrayList = new ArrayList<>();
        arrayList.add(new Phrases.Word1("minto wuksus","Where are you going?"));
        arrayList.add(new Phrases.Word1("tinne oyaasene?","What is your name?"));
        arrayList.add(new Phrases.Word1("oyaaset","My name is.."));
        arrayList.add(new Phrases.Word1("michekses?","How are you feeling?"));
        arrayList.add(new Phrases.Word1("kuchi achit","I'm feeling good"));
        arrayList.add(new Phrases.Word1("eenes'aa?","Are you coming"));
        arrayList.add(new Phrases.Word1("hee'eenem","Yes,I'm coming"));
        arrayList.add(new Phrases.Word1("eenem","I'm coming"));
        arrayList.add(new Phrases.Word1("yoowutis","Let's go"));
        arrayList.add(new Phrases.Word1("anni'nem","Come here"));

        MyAdapter4 myAdapter = new MyAdapter4(this,R.layout.activity_family,arrayList);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(myAdapter);

    }
}
