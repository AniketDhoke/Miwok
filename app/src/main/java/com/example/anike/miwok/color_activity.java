package com.example.anike.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class color_activity extends AppCompatActivity {

    ListView listView;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        final ArrayList<Main2Activity.Word> arrayList = new ArrayList<>();
        arrayList.add(new Main2Activity.Word("wetetti","red",R.mipmap.color_red,R.raw.color_red));
        arrayList.add(new Main2Activity.Word("chokokki","green",R.mipmap.color_green,R.raw.color_green));
        arrayList.add(new Main2Activity.Word("takaakki","brown",R.mipmap.color_brown,R.raw.color_brown));
        arrayList.add(new Main2Activity.Word("topoppi","gray",R.mipmap.color_gray,R.raw.color_gray));
        arrayList.add(new Main2Activity.Word("kululli","black",R.mipmap.color_black,R.raw.color_black));
        arrayList.add(new Main2Activity.Word("kelelli","white",R.mipmap.color_white,R.raw.color_white));
        arrayList.add(new Main2Activity.Word("topiise","dusty yellow",R.mipmap.color_dusty_yellow,R.raw.color_dusty_yellow));
        arrayList.add(new Main2Activity.Word("chiwiite","mustard yellow",R.mipmap.color_mustard_yellow,R.raw.color_mustard_yellow));

        MyAdapter1 myAdapter = new MyAdapter1(this,R.layout.activity_numbers,arrayList,R.color.color_activity);

        listView = findViewById(R.id.listView);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                releaseMediaPlayer();
                Main2Activity.Word words = arrayList.get(i);
                mediaPlayer = MediaPlayer.create(color_activity.this, words.getmSoundResourceId());
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
