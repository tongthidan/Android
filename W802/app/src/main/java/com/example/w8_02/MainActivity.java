package com.example.w8_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.w8_02.model.User;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        Intent i = getIntent();
        User u1= (User) i.getSerializableExtra("account");
        User u2= (User) i.getSerializableExtra("data");
        if(u1.getUsername().equalsIgnoreCase(u2.getUsername()) &&
                u1.getPassword().equalsIgnoreCase(u2.getPassword())){
            tv.setText("Hello "+ u1.getUsername());
        }else {
            tv.setText("Dang nhap sai !");
        }
    }
}