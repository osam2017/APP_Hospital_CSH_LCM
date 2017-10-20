package com.example.administrator.hospitalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

import static com.loopj.android.http.AsyncHttpClient.log;

public class MainActivity extends AppCompatActivity implements OnClickListener, View.OnLongClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnAdmin = (ImageButton) findViewById(R.id.btnAdmin);
        ImageButton main_emergency = (ImageButton) findViewById(R.id.main_emergency);
        main_emergency.setOnClickListener(this);
        ImageButton main_doctor = (ImageButton) findViewById(R.id.main_doctor);
        main_doctor.setOnClickListener(this);
        btnAdmin.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()){
            case R.id.main_emergency:
                Intent intentpopup = new Intent(this, EmergencyActivity.class);
                startActivity(intentpopup);
                break;

            case R.id.main_doctor:
                Intent intentChooseHospital = new Intent(this, Doctor_Choose_hospitalActivity.class);
                log.i("intent_maindoctor","befor call");
                startActivity(intentChooseHospital);
                log.i("intent_maindoctor","after call");
                break;
        }
    }

    @Override
    public boolean onLongClick(View v) {

        Intent intentadmin_login = new Intent(this, Admin_loginActivity.class);
        startActivity(intentadmin_login);

        return false;
    }
}

