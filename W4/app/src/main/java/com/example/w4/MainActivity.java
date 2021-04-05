package com.example.w4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    private AutoCompleteTextView txt1;
    private MultiAutoCompleteTextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.one);
        txt2 = findViewById(R.id.many);
        String[] list = getResources().getStringArray(R.array.country);


        txt1.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list));
        txt1.addTextChangedListener(this);

        txt2.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list));
        txt2.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        txt2.addTextChangedListener(this);

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}