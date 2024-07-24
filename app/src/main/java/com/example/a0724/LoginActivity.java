package com.example.a0724;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {
    private EditText emailEditText,passwordEditText;
    private TextView statusTextView;
    private Button loginButton;
    ActivityResultLauncher<Intent> launcher;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        emailEditText=findViewById(R.id.editTextText1);
        passwordEditText=findViewById(R.id.editTextText2);
        statusTextView=findViewById(R.id.textView1);
        loginButton=findViewById(R.id.button1);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=emailEditText.getText().toString();
                String password=passwordEditText.getText().toString();

                Intent intent=new Intent(LoginActivity.this,Login_Sub.class);
                intent.putExtra("ID",email);
                intent.putExtra("Password",password);
                launcher.launch(intent);
            }
        });
        launcher=registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                result -> {
            if(result.getResultCode()== Activity.RESULT_OK){
                Intent data=result.getData();
                statusTextView.setText(data.getStringExtra("status"));
            }
                }
                );

    }
}
