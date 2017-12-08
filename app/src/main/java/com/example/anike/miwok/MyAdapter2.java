package com.example.anike.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by anike on 08-12-2017.
 */

public class MyAdapter2 extends ArrayAdapter<Main2Activity.Word> {

    public MyAdapter2(@NonNull Context context, int resource, @NonNull List<Main2Activity.Word> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if(v == null)
        {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            v = layoutInflater.inflate(R.layout.activity_color,parent,false);
        }

        ImageView imageView = (ImageView) v.findViewById(R.id.image2);
        TextView textView = (TextView) v.findViewById(R.id.text3);
        TextView textView1 = (TextView) v.findViewById(R.id.textText99);

        imageView.setImageResource(getItem(position).getmImageResources());
        textView.setText(getItem(position).getmDefaultLang());
        textView1.setText(getItem(position).getMiwokLang());

        return v;
    }

}
