package com.example.anike.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class family_activity extends AppCompatActivity {

    ListView listView;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        final ArrayList<Main2Activity.Word> arrayList = new ArrayList<>();
        arrayList.add(new Main2Activity.Word("epe","father",R.mipmap.family_father,R.raw.family_father));
        arrayList.add(new Main2Activity.Word("eta","mother",R.mipmap.family_mother,R.raw.family_mother));
        arrayList.add(new Main2Activity.Word("angsi","son",R.mipmap.family_son,R.raw.family_son));
        arrayList.add(new Main2Activity.Word("tune","daughter",R.mipmap.family_daughter,R.raw.family_daughter));
        arrayList.add(new Main2Activity.Word("taachi","older brother",R.mipmap.family_older_brother,R.raw.family_older_brother));
        arrayList.add(new Main2Activity.Word("chalitti","younger brother",R.mipmap.family_younger_brother,R.raw.family_younger_brother));
        arrayList.add(new Main2Activity.Word("tete","older sister",R.mipmap.family_older_sister,R.raw.family_older_sister));
        arrayList.add(new Main2Activity.Word("kolliti","younger sister",R.mipmap.family_younger_sister,R.raw.family_younger_sister));
        arrayList.add(new Main2Activity.Word("ama","grandmother",R.mipmap.family_grandmother,R.raw.family_grandmother));
        arrayList.add(new Main2Activity.Word("pappa","grandfather",R.mipmap.family_grandfather,R.raw.family_grandfather));

        MyAdapter1 myAdapter = new MyAdapter1(this,R.layout.activity_numbers,arrayList,R.color.family_activity);

        listView = findViewById(R.id.listView);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                releaseMediaPlayer();
                Main2Activity.Word words = arrayList.get(i);
                mediaPlayer = MediaPlayer.create(family_activity.this, words.getmSoundResourceId());
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
