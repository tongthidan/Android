package com.example.w801;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btOpen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btOpen = findViewById(R.id.btnOpen);
        btOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Integer age = 22;
                intent.putExtra("age",age);
                String name = "To An an";
                intent.putExtra("name",name);
                Student s = new Student(R.drawable.ic_android,"To An AN",9);
                intent.putExtra("student",s);
                startActivity(intent);
            }
        });
    }
}