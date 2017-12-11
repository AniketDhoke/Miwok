package com.example.anike.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class numbers_activity extends AppCompatActivity {


    ListView listView;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        final ArrayList<Main2Activity.Word> arrayList = new ArrayList<>();
        arrayList.add(new Main2Activity.Word("lutti","one",R.mipmap.number_one,R.raw.number_one));
        arrayList.add(new Main2Activity.Word("otiiko","two",R.mipmap.number_two,R.raw.number_two));
        arrayList.add(new Main2Activity.Word("tolookosu","three",R.mipmap.number_three,R.raw.number_three));
        arrayList.add(new Main2Activity.Word("oyyisa","four",R.mipmap.number_four,R.raw.number_four));
        arrayList.add(new Main2Activity.Word("massokka","five",R.mipmap.number_five,R.raw.number_five));
        arrayList.add(new Main2Activity.Word("temmokka","six",R.mipmap.number_six,R.raw.number_six));
        arrayList.add(new Main2Activity.Word("kenekaku","seven",R.mipmap.number_seven,R.raw.number_seven));
        arrayList.add(new Main2Activity.Word("kawinta","eight",R.mipmap.number_eight,R.raw.number_eight));
        arrayList.add(new Main2Activity.Word("wo'e","nine",R.mipmap.number_nine,R.raw.number_nine));
        arrayList.add(new Main2Activity.Word("na'aacha","ten",R.mipmap.number_ten,R.raw.number_ten));

        MyAdapter1 myAdapter = new MyAdapter1(this,R.layout.activity_numbers,arrayList,R.color.numbers_activity);

        listView =  findViewById(R.id.listView);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                releaseMediaPlayer();
                Main2Activity.Word words = arrayList.get(i);
                mediaPlayer = MediaPlayer.create(numbers_activity.this, words.getmSoundResourceId());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        releaseMediaPlayer();
                    }
                });
            }
        });
    }

    public void releaseMediaPlayer(){
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

}
