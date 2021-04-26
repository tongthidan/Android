package com.example.w8_02;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.w8_02.model.User;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextuser, editTextPass;
    Button btnLogin, btnRegister;
    private  static final  int REQUEST_CODE = 1000;
    User u;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextPass = findViewById(R.id.editPass);
        editTextuser = findViewById(R.id.editusername);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister= findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextuser.getText().toString();
                String pass = editTextPass.getText().toString();
                User acc = new User(username,pass);
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("account",acc);
                intent.putExtra("data",u);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE){
            if(resultCode == RESULT_OK){
                if(data != null){
                     u = (User) data.getSerializableExtra("data");
                     editTextuser.setText(u.getUsername());
                    editTextPass.setText(u.getPassword());

                }
                else{
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();

                }
            }
        }
    }
}