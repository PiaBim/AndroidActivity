package com.example.a0724;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login_Test1 extends AppCompatActivity {
    private EditText IDEditText,passwordEditText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_test1);
        Button btn=(Button)findViewById(R.id.button1);
        IDEditText=findViewById(R.id.editText1);
        passwordEditText=findViewById(R.id.editText2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ID=IDEditText.getText().toString();
                String password=passwordEditText.getText().toString();
                Intent intent = new Intent(Login_Test1.this, Login_Test2.class);
                intent.putExtra("ID",ID);
                intent.putExtra("Password",password);
                startActivity(intent);
            }
        });
    }
}
