package com.example.anike.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class numbers_activity extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        final ArrayList<Main2Activity.Word> arrayList = new ArrayList<>();
        arrayList.add(new Main2Activity.Word("lutti","one",R.mipmap.number_one));
        arrayList.add(new Main2Activity.Word("otiiko","two",R.mipmap.number_two));
        arrayList.add(new Main2Activity.Word("tolookosu","three",R.mipmap.number_three));
        arrayList.add(new Main2Activity.Word("oyyisa","four",R.mipmap.number_four));
        arrayList.add(new Main2Activity.Word("massokka","five",R.mipmap.number_five));
        arrayList.add(new Main2Activity.Word("temmokka","six",R.mipmap.number_six));
        arrayList.add(new Main2Activity.Word("kenekaku","seven",R.mipmap.number_seven));
        arrayList.add(new Main2Activity.Word("kawinta","eight",R.mipmap.number_eight));
        arrayList.add(new Main2Activity.Word("wo'e","nine",R.mipmap.number_nine));
        arrayList.add(new Main2Activity.Word("na'aacha","ten",R.mipmap.number_ten));

        MyAdapter1 myAdapter = new MyAdapter1(this,R.layout.activity_numbers,arrayList,R.color.numbers_activity);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(myAdapter);
    }
}
