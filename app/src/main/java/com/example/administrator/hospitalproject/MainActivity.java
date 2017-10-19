package com.example.administrator.hospitalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton main_imgbtn = (ImageButton) findViewById(R.id.main_imgbtn);
        main_imgbtn.setOnClickListener(this);
        ImageButton main_emergency = (ImageButton) findViewById(R.id.main_emergency);
        main_emergency.setOnClickListener(this);
        ImageButton main_doctor = (ImageButton) findViewById(R.id.main_doctor);
        main_doctor.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()){
            case R.id.main_imgbtn:
                Intent intentadmin_login = new Intent(this, Admin_login.class);
                startActivity(intentadmin_login);
                break;

            case R.id.main_emergency:
                Intent intentpopup = new Intent(this, Emergency.class);
                startActivity(intentpopup);
                break;

            case R.id.main_doctor:
                Intent intenthospital_list_user = new Intent(this, Doctor_Choose_hopital.class);
                startActivity(intenthospital_list_user);
                break;
        }
    }

}

