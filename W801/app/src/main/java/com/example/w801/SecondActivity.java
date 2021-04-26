package com.example.w801;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tv,tvName;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = findViewById(R.id.tvResult);
        imageView = findViewById(R.id.image);
        tvName = findViewById(R.id.tv);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        tv.setText("Hello"+ name);
        int age = intent.getIntExtra("age",20);
        String st = "Name "+ name +"\n age :"+ age;
        Student s = (Student) intent.getSerializableExtra("student");
        imageView.setImageResource(s.getSourceImg());
        tvName.setText("Name: "+ s.getName()+"\n Mark: "+ s.getMark());
        tv.setText(st);
    }
}