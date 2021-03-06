package com.example.administrator.hospitalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View.OnClickListener;

import java.util.ArrayList;

import static com.loopj.android.http.AsyncHttpClient.log;

public class Doctor_Choose_hospitalActivity extends AppCompatActivity implements OnClickListener, AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_choose_hospital);

        ListView listView = (ListView)findViewById(R.id.hospital_list_user);
        ArrayList<String> arrayList1 = new ArrayList<String>();

        arrayList1.add("국군강릉병원");
        arrayList1.add("국군고양병원");
        arrayList1.add("국군구리병원");
        arrayList1.add("국군대구병원");
        arrayList1.add("국군대전병원");
        arrayList1.add("국군수도병원");
        arrayList1.add("국군양주병원");
        arrayList1.add("국군일동병원");
        arrayList1.add("국군청평병원");
        arrayList1.add("국군춘천병원");
        arrayList1.add("국군함평병원");
        arrayList1.add("국군홍천병원");
        log.i("Doctor_chose","arrayList add below");

        ArrayAdapter<String> hospital_list_user_Adapter1;
        log.i("Doctor_chose","adapter1");

        hospital_list_user_Adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList1);
        listView.setAdapter(hospital_list_user_Adapter1);
        listView.setOnItemClickListener(this);
        log.i("Doctor_chose","Listener");
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intentquestion= new Intent(this, QuestionActivity.class);
        startActivity(intentquestion);
    }
}
