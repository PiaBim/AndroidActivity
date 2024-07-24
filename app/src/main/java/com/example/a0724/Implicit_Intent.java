package com.example.a0724;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Implicit_Intent extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.implicit_intent);
    }

    public void onClick(View v) {
        Intent intent=null;
        if (v.getId() == R.id.button1) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        } else if (v.getId() == R.id.button2) {
            intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-1234-5678"));
        } else if (v.getId() == R.id.button3) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.30,127.2?z=10"));
        } else if (v.getId() == R.id.button4) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people"));
        }
        if(intent!=null){
            startActivity(intent);
        }
    }
}
