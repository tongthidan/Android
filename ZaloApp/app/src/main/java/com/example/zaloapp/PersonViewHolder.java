package com.example.zaloapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    TextView textViewTitle, textViewContent,textViewTime;
    ImageView imageView;
    public PersonViewHolder(@NonNull View v) {

        super(v);
        textViewTitle = v.findViewById(R.id.item_title);
        textViewContent = v.findViewById(R.id.item_content);
        textViewTime = v.findViewById(R.id.item_time);
        imageView = v.findViewById(R.id.item_img);

    }
}
