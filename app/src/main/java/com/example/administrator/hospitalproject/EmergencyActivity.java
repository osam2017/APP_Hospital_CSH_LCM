package com.example.administrator.hospitalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class  EmergencyActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        ImageButton emergency_question = (ImageButton) findViewById(R.id.imageButton11);
        emergency_question.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()) {
            case R.id.imageButton11:
                Intent intentemergency_question = new Intent(this, Emergency_questionActivity.class);
                startActivity(intentemergency_question);
                break;
        }
    }
}
