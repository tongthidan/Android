package com.example.w8_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.w8_02.model.User;

public class RegisterActivity extends AppCompatActivity {
    private EditText editTextuser, editTextPass;
    Button btnCancel, btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextPass = findViewById(R.id.editPass);
        editTextuser = findViewById(R.id.editusername);
        btnCancel = findViewById(R.id.btnCancel);
        btnRegister= findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User u =  new User(editTextuser.getText().toString(),editTextPass.getText().toString());
                Intent intent= new Intent();
                intent.putExtra("data",u);

                setResult(RESULT_OK,intent);
                finish();// close
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}