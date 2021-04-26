package com.example.w8_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnWeb, btnSMS, btnPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnWeb = findViewById(R.id.btnWeb);
        btnPhone = findViewById(R.id.btnPhone);
        btnSMS = findViewById(R.id.btnMess);
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://dantri.com.vn/blog/doi-tuyen-viet-nam-va-giac-mo-dot-bien-20210425044733333.htm"));
                startActivity(intent);
            }
        });
        btnSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("sms:" + "0964048725"));
                intent.putExtra("sms_body", "Hello T");
                startActivity(intent);
            }
        });
        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 0964048725"));
                startActivity(intent);
            }
        });
    }
}