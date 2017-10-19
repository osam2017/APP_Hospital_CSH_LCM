package com.example.administrator.hospitalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Admin_loginActivity extends AppCompatActivity implements View.OnClickListener{
    String id;
    String password;
    String correctid = "afmc";
    String correctpassword = "admin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        Button loginbtn = (Button) findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText idedittext = (EditText) findViewById(R.id.idedittext);
        EditText passwordedittext = (EditText) findViewById(R.id.passwordedittext);
        id = idedittext.getText().toString();
        password = passwordedittext.getText().toString();
        if(id.equals(correctid) && password.equals(correctpassword)){
            Intent intentadmin = new Intent(this, AdminActivity.class);
            startActivity(intentadmin);
        }else{
            Toast.makeText(getApplicationContext(), "ID 또는 비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
        }
    }
}