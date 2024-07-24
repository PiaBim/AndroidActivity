package com.example.a0724;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login_Test2 extends AppCompatActivity {
    EditText emailEditText,passwordEditText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_test2);
        emailEditText=(EditText)findViewById(R.id.editText1);
        passwordEditText=(EditText)findViewById(R.id.editText2);

        Intent intent=getIntent();
        if(intent!=null){
            String email=intent.getStringExtra("ID");
            String password=intent.getStringExtra("Password");
            emailEditText.setText(email);
            passwordEditText.setText(password);
        }
    }
}
