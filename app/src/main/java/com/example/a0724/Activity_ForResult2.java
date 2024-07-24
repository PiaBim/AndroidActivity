package com.example.a0724;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_ForResult2 extends AppCompatActivity {
    EditText text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forresult2);
        text=findViewById(R.id.editText2);
        Button btn1=findViewById(R.id.button1);
        Button btn2=findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tx=text.getText().toString();
                Intent intent=new Intent();
                intent.putExtra("result",tx);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }
}
