package com.example.a0724;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Save_Restore extends AppCompatActivity {
    Button btn1,btn2;
    TextView text;
    int count =0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.save_restore);
            text = (TextView) findViewById(R.id.textView1);
            btn1 = (Button) findViewById(R.id.button1);
            btn2 = (Button) findViewById(R.id.button2);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    count++;
                    text.setText("현재 개수=" + count);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    count--;
                    text.setText("현재 개수=" + count);
                }
            });

            if (savedInstanceState != null) {
                count = savedInstanceState.getInt("count");
                text.setText("현재 개수=" + count);
            }
        }
    }
    @Override
    public void onSaveInstanceState (Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
    }
    }
