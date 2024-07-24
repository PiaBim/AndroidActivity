package com.example.a0724;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login_Sub extends AppCompatActivity {
    private TextView displayIDtextView, displayPWtextView,statusTextView;
    String id,password;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_sub);

        displayIDtextView=findViewById(R.id.textView1);
        displayPWtextView=findViewById(R.id.textView2);
        statusTextView=findViewById(R.id.textView3);

        Intent intent=getIntent();
        if(intent!=null){
            id=intent.getStringExtra("ID");
            password=intent.getStringExtra("Password");

            displayIDtextView.setText("아이디:+"+id);
            displayPWtextView.setText("비밀번호:"+password);
        }

    }
    public void check(View v){
        Intent intent=new Intent();
        if(isUserValid(id,password)){
            intent.putExtra("status","로그인 성공");
        }
        else{
            intent.putExtra("status","로그인 실패");
        }
        setResult(RESULT_OK,intent);
        finish();
    }
    private boolean isUserValid(String username,String password){
        return username.equals("kim") && password.equals("1234");
    }
}
