package com.example.administrator.hospitalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.loopj.android.http.AsyncHttpClient.log;

public class Admin_list extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener{
    ArrayList<Article> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_list);

        ListView listView = (ListView)findViewById(R.id.Doctor_list);

        ArrayList<String> arrayList1 = new ArrayList<String>();

        try {
            Dao dao = new Dao(getApplicationContext());

            list = dao.getArticleList();
            log.i("getUserName", "asdasd : " + list.size());
            for (int i = 0; list.size() < i; i++) {
                arrayList1.add(list.get(i).getUserName());
            }

            ArrayAdapter<String> hospital_list_user_Adapter1;

            hospital_list_user_Adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList1);
            listView.setAdapter(hospital_list_user_Adapter1);
            listView.setOnItemClickListener(this);
            log.i("Doctor_chose","Listener");
        }catch(Exception e){
            log.i("Admin_list_DaoError",e.getMessage());
            Toast.makeText(this, "등록된 환자가 없습니다.", Toast.LENGTH_LONG).show();
            Intent intentMain = new Intent(this, MainActivity.class);
            startActivity(intentMain);
        }


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
