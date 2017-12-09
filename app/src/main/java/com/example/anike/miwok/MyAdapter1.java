package com.example.anike.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by anike on 07-12-2017.
 */

public class MyAdapter1 extends ArrayAdapter<Main2Activity.Word> {

    ImageView imageView;
    TextView textView,textView1;
    private int mColorResourceId;

    public MyAdapter1(@NonNull Context context, int resource, @NonNull List<Main2Activity.Word> objects,int colorResourceId) {
        super(context, resource, objects);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if(v == null)
        {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            v = layoutInflater.inflate(R.layout.activity_numbers,parent,false);
        }

        imageView = (ImageView) v.findViewById(R.id.image9);
        textView = (TextView) v.findViewById(R.id.text1);
        textView1 = (TextView) v.findViewById(R.id.textView8);

        textView.setText(getItem(position).getmDefaultLang());
        textView1.setText(getItem(position).getMiwokLang());

        if(getItem(position).hasImage()){
            imageView.setImageResource(getItem(position).getmImageResources());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = v.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return v;
    }
}
