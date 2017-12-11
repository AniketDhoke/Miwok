package com.example.anike.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class phrases_activity extends AppCompatActivity {

    ListView listView;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);


        final ArrayList<Main2Activity.Word> arrayList = new ArrayList<>();
        arrayList.add(new Main2Activity.Word("minto wuksus","Where are you going?",R.raw.phrase_where_are_you_going));
        arrayList.add(new Main2Activity.Word("tinne oyaasene?","What is your name?",R.raw.phrase_what_is_your_name));
        arrayList.add(new Main2Activity.Word("oyaaset","My name is..",R.raw.phrase_my_name_is));
        arrayList.add(new Main2Activity.Word("michekses?","How are you feeling?",R.raw.phrase_how_are_you_feeling));
        arrayList.add(new Main2Activity.Word("kuchi achit","I'm feeling good",R.raw.phrase_im_feeling_good));
        arrayList.add(new Main2Activity.Word("eenes'aa?","Are you coming",R.raw.phrase_are_you_coming));
        arrayList.add(new Main2Activity.Word("hee'eenem","Yes,I'm coming",R.raw.phrase_yes_im_coming));
        arrayList.add(new Main2Activity.Word("eenem","I'm coming",R.raw.phrase_im_coming));
        arrayList.add(new Main2Activity.Word("yoowutis","Let's go",R.raw.phrase_lets_go));
        arrayList.add(new Main2Activity.Word("anni'nem","Come here",R.raw.phrase_come_here));

        MyAdapter1 myAdapter = new MyAdapter1(this,R.layout.activity_numbers,arrayList,R.color.phrases_activity);

        listView = findViewById(R.id.listView);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                releaseMediaPlayer();
                Main2Activity.Word words = arrayList.get(i);
                mediaPlayer = MediaPlayer.create(phrases_activity.this, words.getmSoundResourceId());
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
