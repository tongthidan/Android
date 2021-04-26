package com.example.thuchanh2v3;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    TextView textViewID, textViewName, textViewGender,textViewDob;
    ImageView imageView ;
    public StudentViewHolder(@NonNull View v) {
        super(v);
        imageView = v.findViewById(R.id.item_image);
        textViewDob = v.findViewById(R.id.item_Dob);
        textViewGender = v.findViewById(R.id.item_Gender);
        textViewName = v.findViewById(R.id.item_Name);
        textViewID = v.findViewById(R.id.item_ID);
    }
}
