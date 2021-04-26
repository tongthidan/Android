package com.example.bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextDai, editTextRong, editTextCao;
    TextView textViewResult;
    Button btnTinh;
    RadioButton radioButtonThe, radioButtonDien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextCao = findViewById(R.id.editChieuCao);

        editTextDai = findViewById(R.id.editChieuDai);
        editTextRong = findViewById(R.id.editChieuCao);
        btnTinh = findViewById(R.id.btnTinhToan);
        radioButtonDien = findViewById(R.id.radioDientich);
        radioButtonThe = findViewById(R.id.radioTheTich);

        textViewResult = findViewById(R.id.result);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double dai,rong, cao ;
                dai = Double.parseDouble(editTextDai.getText().toString());
                rong = Double.parseDouble(editTextRong.getText().toString());
                cao = Double.parseDouble(editTextCao.getText().toString());
                if(radioButtonDien.isChecked()){
                    textViewResult.setText(""+ 2*(dai *rong + dai*cao + cao *rong));
                }
                else{
                    textViewResult.setText(""+ (dai*rong*cao));
                }
            }
        });

    }
}