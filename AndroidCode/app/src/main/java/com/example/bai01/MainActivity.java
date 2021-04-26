package com.example.bai01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btCalcultor;
    EditText result;
    EditText height, weight;
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        btCalcultor = findViewById(R.id.btCalculatorBMI);
       btCalcultor.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               result.setText("" + Double.parseDouble(weight.getText().toString())/((Double.parseDouble(height.getText().toString()))*(Double.parseDouble(height.getText().toString()))));
           }
       });



    }


}