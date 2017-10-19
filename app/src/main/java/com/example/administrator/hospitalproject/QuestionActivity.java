package com.example.administrator.hospitalproject;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.view.View.OnClickListener;

import java.util.LinkedList;

import static com.loopj.android.http.AsyncHttpClient.log;


public class QuestionActivity extends AppCompatActivity implements OnClickListener {

    private Button postBtn;

    private ToggleButton deptBtn1;
    private ToggleButton deptBtn2;
    private ToggleButton deptBtn3;
    private ToggleButton deptBtn4;
    private ToggleButton deptBtn5;
    private ToggleButton deptBtn6;
    private ToggleButton deptBtn7;
    private ToggleButton deptBtn8;
    private ToggleButton deptBtn9;
    private ToggleButton deptBtn10;
    private ToggleButton deptBtn11;
    private ToggleButton deptBtn12;
    private ToggleButton deptBtn13;
    private ToggleButton deptBtn14;
    private ToggleButton deptBtn15;

    private ToggleButton SxBtn1;
    private ToggleButton SxBtn2;
    private ToggleButton SxBtn3;
    private ToggleButton SxBtn4;
    private ToggleButton SxBtn5;
    private ToggleButton SxBtn6;
    private ToggleButton SxBtn7;
    private ToggleButton SxBtn8;
    private ToggleButton SxBtn9;
    private ToggleButton SxBtn10;

    private EditText pastContents;
    private EditText dtContents;
    private EditText userNames;
    private EditText userNums;

    private String pastContent;
    private String dtContent;
    private String userName;
    private String userNum;




    private LinkedList<Object> SxStateArray = new LinkedList<Object>();
    private LinkedList<Object> deptStateArray = new LinkedList<Object>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        Dao dao = new Dao(getApplicationContext());

        boolean temp;

        pastContents = (EditText) findViewById(R.id.pastContent);
        dtContents = (EditText) findViewById(R.id.dtContent);
        userNames = (EditText) findViewById(R.id.userName);
        userNums = (EditText) findViewById(R.id.userNum);

        pastContent = pastContents.getText().toString();
        dtContent = pastContents.getText().toString();
        userName = pastContents.getText().toString();
        userNum = pastContents.getText().toString();


        postBtn = (Button) this.findViewById(R.id.postBtn);
        postBtn.setOnClickListener(this);

        deptBtn1 = (ToggleButton) this.findViewById(R.id.deptBtn1);
        deptBtn1.setOnClickListener(this);

        deptBtn2 = (ToggleButton) this.findViewById(R.id.deptBtn2);
        deptBtn2.setOnClickListener(this);

        deptBtn3 = (ToggleButton) this.findViewById(R.id.deptBtn3);
        deptBtn3.setOnClickListener(this);

        deptBtn4 = (ToggleButton) this.findViewById(R.id.deptBtn4);
        deptBtn4.setOnClickListener(this);

        deptBtn5 = (ToggleButton) this.findViewById(R.id.deptBtn5);
        deptBtn5.setOnClickListener(this);

        deptBtn6 = (ToggleButton) this.findViewById(R.id.deptBtn6);
        deptBtn6.setOnClickListener(this);

        deptBtn7 = (ToggleButton) this.findViewById(R.id.deptBtn7);
        deptBtn7.setOnClickListener(this);

        deptBtn8 = (ToggleButton) this.findViewById(R.id.deptBtn8);
        deptBtn8.setOnClickListener(this);

        deptBtn9 = (ToggleButton) this.findViewById(R.id.deptBtn9);
        deptBtn9.setOnClickListener(this);

        deptBtn10 = (ToggleButton) this.findViewById(R.id.deptBtn10);
        deptBtn10.setOnClickListener(this);

        deptBtn11 = (ToggleButton) this.findViewById(R.id.deptBtn11);
        deptBtn11.setOnClickListener(this);

        deptBtn12 = (ToggleButton) this.findViewById(R.id.deptBtn12);
        deptBtn12.setOnClickListener(this);

        deptBtn13 = (ToggleButton) this.findViewById(R.id.deptBtn13);
        deptBtn13.setOnClickListener(this);

        deptBtn14 = (ToggleButton) this.findViewById(R.id.deptBtn14);
        deptBtn14.setOnClickListener(this);

        deptBtn15 = (ToggleButton) this.findViewById(R.id.deptBtn15);
        deptBtn15.setOnClickListener(this);


        SxBtn1 = (ToggleButton) this.findViewById(R.id.SxBtn1);
        SxBtn1.setOnClickListener(this);

        SxBtn2 = (ToggleButton) this.findViewById(R.id.SxBtn2);
        SxBtn2.setOnClickListener(this);

        SxBtn3 = (ToggleButton) this.findViewById(R.id.SxBtn3);
        SxBtn3.setOnClickListener(this);

        SxBtn4 = (ToggleButton) this.findViewById(R.id.SxBtn4);
        SxBtn4.setOnClickListener(this);

        SxBtn5 = (ToggleButton) this.findViewById(R.id.SxBtn5);
        SxBtn5.setOnClickListener(this);

        SxBtn6 = (ToggleButton) this.findViewById(R.id.SxBtn6);
        SxBtn6.setOnClickListener(this);

        SxBtn7 = (ToggleButton) this.findViewById(R.id.SxBtn7);
        SxBtn7.setOnClickListener(this);

        SxBtn8 = (ToggleButton) this.findViewById(R.id.SxBtn8);
        SxBtn8.setOnClickListener(this);

        SxBtn9 = (ToggleButton) this.findViewById(R.id.SxBtn9);
        SxBtn9.setOnClickListener(this);

        SxBtn10 = (ToggleButton) this.findViewById(R.id.SxBtn10);
        SxBtn10.setOnClickListener(this);


        log.i("QuestionActivity_onCreate","Success");
    }


    @Override
    public void onClick(View v) {
        String SxString;
        String deptString;
        switch (v.getId()) {

            case R.id.postBtn:
                try {

                    //if() 데이터가 하나라도 있어야 함
                    deptString = listStringSum(deptStateArray);
                    log.i("QuestionActivity_onClick_deptSringSum", "Success");
                    SxString = listStringSum(SxStateArray);
                    log.i("QuestionActivity_onClick_SxSringSum", "Success");

                    Dao dao = new Dao(getApplicationContext());
                    log.i("userasd", "userName" + userName);
                    dao.insertData(userName, userNum, deptString, SxString, pastContent, dtContent);

                    Intent intentMain = new Intent(this, MainActivity.class);
                    startActivity(intentMain);
                }catch(Exception e){
                    Toast.makeText(getApplicationContext(), "선택하지 않은 목록이 있습니다.", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.deptBtn1:
                    if (deptBtn1.isChecked()) {
                        deptBtn1.setTextColor(Color.BLUE);
                        deptStateArray.add(R.id.deptBtn1);

                    } else {
                       NodeRemove(deptStateArray, deptBtn1, R.id.deptBtn1);
                        deptBtn1.setTextColor(Color.BLUE);
                    }
                    break;
            case R.id.deptBtn2:
                if (deptBtn2.isChecked()) {
                    deptBtn2.setTextColor(Color.BLUE);
                    deptStateArray.add(R.id.deptBtn2);

                } else {
                    NodeRemove(deptStateArray, deptBtn2, R.id.deptBtn2);
                    deptBtn2.setTextColor(Color.BLUE);
                }
                break;
            case R.id.deptBtn3:
                if (deptBtn3.isChecked()) {
                    deptBtn3.setTextColor(Color.BLUE);
                    deptStateArray.add(R.id.deptBtn3);

                } else {
                    NodeRemove(deptStateArray, deptBtn3, R.id.deptBtn3);
                    deptBtn3.setTextColor(Color.BLUE);
                }
                break;
            case R.id.deptBtn4:
                if (deptBtn4.isChecked()) {
                    deptBtn4.setTextColor(Color.BLUE);
                    deptStateArray.add(R.id.deptBtn4);

                } else {
                    NodeRemove(deptStateArray, deptBtn4, R.id.deptBtn4);
                    deptBtn4.setTextColor(Color.BLUE);
                }
                break;
            case R.id.deptBtn5:
                if (deptBtn5.isChecked()) {
                    deptBtn5.setTextColor(Color.BLUE);
                    deptStateArray.add(R.id.deptBtn5);

                } else {
                    NodeRemove(deptStateArray, deptBtn5, R.id.deptBtn5);
                    deptBtn5.setTextColor(Color.BLUE);
                }
                break;
            case R.id.deptBtn6:
                if (SxBtn6.isChecked()) {
                    SxBtn6.setTextColor(Color.BLUE);
                    deptStateArray.add(R.id.deptBtn6);

                } else {
                    NodeRemove(deptStateArray, SxBtn6,R.id.deptBtn6);
                    deptBtn5.setTextColor(Color.BLUE);
                }
                break;
            case R.id.deptBtn7:
                if (deptBtn7.isChecked()) {
                    deptBtn7.setTextColor(Color.BLUE);
                    deptStateArray.add(R.id.deptBtn7);

                } else {
                    NodeRemove(deptStateArray, deptBtn7,R.id.deptBtn7);
                    deptBtn7.setTextColor(Color.BLUE);
                }
                break;
            case R.id.deptBtn8:
                if (deptBtn8.isChecked()) {
                    deptBtn8.setTextColor(Color.BLUE);
                    deptStateArray.add(R.id.deptBtn8);

                } else {
                    NodeRemove(deptStateArray, deptBtn8,R.id.deptBtn8);
                    deptBtn8.setTextColor(Color.BLUE);
                }
                break;
            case R.id.deptBtn9:
                if (deptBtn9.isChecked()) {
                    deptBtn9.setTextColor(Color.BLUE);
                    deptStateArray.add(R.id.deptBtn9);

                } else {
                    NodeRemove(deptStateArray, deptBtn9,R.id.deptBtn9);
                    deptBtn9.setTextColor(Color.BLUE);
                }
                break;
            case R.id.deptBtn10:
                if (deptBtn10.isChecked()) {
                    deptBtn10.setTextColor(Color.BLUE);
                    deptStateArray.add(R.id.deptBtn10);

                } else {
                    NodeRemove(deptStateArray, deptBtn10,R.id.deptBtn10);
                    deptBtn10.setTextColor(Color.BLUE);
                }
                break;
            case R.id.deptBtn11:
                if (deptBtn11.isChecked()) {
                    deptBtn11.setTextColor(Color.BLUE);
                    deptStateArray.add(R.id.deptBtn11);

                } else {
                    NodeRemove(deptStateArray, deptBtn11,R.id.deptBtn11);
                    deptBtn11.setTextColor(Color.BLUE);
                }
                break;
            case R.id.deptBtn12:
                if (deptBtn12.isChecked()) {
                    deptBtn12.setTextColor(Color.BLUE);
                    deptStateArray.add(R.id.deptBtn12);

                } else {
                    NodeRemove(deptStateArray, deptBtn12,R.id.deptBtn12);
                    deptBtn12.setTextColor(Color.BLUE);
                }
                break;
            case R.id.deptBtn13:
                if (deptBtn13.isChecked()) {
                    deptBtn13.setTextColor(Color.BLUE);
                    deptStateArray.add(R.id.deptBtn13);

                } else {
                    NodeRemove(deptStateArray, deptBtn13,R.id.deptBtn13);
                    deptBtn13.setTextColor(Color.BLUE);
                }
                break;
            case R.id.deptBtn14:
                if (deptBtn14.isChecked()) {
                    deptBtn14.setTextColor(Color.BLUE);
                    deptStateArray.add(R.id.deptBtn14);

                } else {
                    NodeRemove(deptStateArray, deptBtn14,R.id.deptBtn14);
                    deptBtn14.setTextColor(Color.BLUE);
                }
                break;
            case R.id.deptBtn15:
                if (deptBtn15.isChecked()) {
                    deptBtn15.setTextColor(Color.BLUE);
                    deptStateArray.add(R.id.deptBtn15);

                } else {
                    NodeRemove(deptStateArray, deptBtn15,R.id.deptBtn15);
                    deptBtn15.setTextColor(Color.BLUE);
                }
                break;



            case R.id.SxBtn1:
                if (SxBtn1.isChecked()) {
                    SxBtn1.setTextColor(Color.BLUE);
                    SxStateArray.add(R.id.SxBtn1);

                } else {
                    NodeRemove(SxStateArray, SxBtn1, R.id.SxBtn1);
                    SxBtn1.setTextColor(Color.BLACK);
                }
                break;
            case R.id.SxBtn2:
                if (SxBtn2.isChecked()) {
                    SxBtn2.setTextColor(Color.BLUE);
                    SxStateArray.add(R.id.SxBtn2);

                } else {
                    NodeRemove(SxStateArray, SxBtn2, R.id.SxBtn2);
                    SxBtn2.setTextColor(Color.BLACK);
                }
                break;
            case R.id.SxBtn3:
                if (SxBtn3.isChecked()) {
                    SxBtn3.setTextColor(Color.BLUE);
                    SxStateArray.add(R.id.SxBtn3);

                } else {
                    NodeRemove(SxStateArray, SxBtn3, R.id.SxBtn3);
                    SxBtn3.setTextColor(Color.BLACK);
                }
                break;
            case R.id.SxBtn4:
                if (SxBtn4.isChecked()) {
                    SxBtn4.setTextColor(Color.BLUE);
                    SxStateArray.add(R.id.SxBtn4);

                } else {
                    NodeRemove(SxStateArray, SxBtn4, R.id.SxBtn4);
                    SxBtn4.setTextColor(Color.BLACK);
                }
                break;
            case R.id.SxBtn5:
                if (SxBtn5.isChecked()) {
                    SxBtn5.setTextColor(Color.BLUE);
                    SxStateArray.add(R.id.SxBtn5);

                } else {
                    NodeRemove(SxStateArray, SxBtn5, R.id.SxBtn5);
                    SxBtn5.setTextColor(Color.BLACK);
                }
                break;
            case R.id.SxBtn6:
                if (SxBtn6.isChecked()) {
                    SxBtn6.setTextColor(Color.BLUE);
                    SxStateArray.add(R.id.SxBtn6);

                } else {
                    NodeRemove(SxStateArray, SxBtn6,R.id.SxBtn6);
                    SxBtn5.setTextColor(Color.BLACK);
                }
                break;
            case R.id.SxBtn7:
                if (SxBtn7.isChecked()) {
                    SxBtn7.setTextColor(Color.BLUE);
                    SxStateArray.add(R.id.SxBtn7);

                } else {
                    NodeRemove(SxStateArray, SxBtn7,R.id.SxBtn7);
                    SxBtn7.setTextColor(Color.BLACK);
                }
                break;
            case R.id.SxBtn8:
                if (SxBtn8.isChecked()) {
                    SxBtn8.setTextColor(Color.BLUE);
                    SxStateArray.add(R.id.SxBtn8);

                } else {
                    NodeRemove(SxStateArray, SxBtn8,R.id.SxBtn8);
                    SxBtn8.setTextColor(Color.BLACK);
                }
                break;
            case R.id.SxBtn9:
                if (SxBtn9.isChecked()) {
                    SxBtn9.setTextColor(Color.BLUE);
                    SxStateArray.add(R.id.SxBtn9);

                } else {
                    NodeRemove(SxStateArray, SxBtn9,R.id.SxBtn9);
                    SxBtn9.setTextColor(Color.BLACK);
                }
                break;
            case R.id.SxBtn10:
                if (SxBtn10.isChecked()) {
                    SxBtn10.setTextColor(Color.BLUE);
                    SxStateArray.add(R.id.SxBtn10);

                } else {
                    NodeRemove(SxStateArray, SxBtn10,R.id.SxBtn10);
                    SxBtn10.setTextColor(Color.BLACK);
                }
                break;

        }


    }

    private  int NodeSerch(LinkedList list, ToggleButton btn, int data){
        for(int i=0; i<list.size(); i++){
            if((int)list.get(i) == data ){
                return i;
            }
        }
        return 0;
    }

    private int NodeRemove(LinkedList list, ToggleButton btn, int data){
        list.remove(NodeSerch(list, btn, data));
        return 0;
    }


    private String listStringSum(LinkedList list){

        String listStr="";
        log.i("QuestionActivity_listStringSumClass_call","Success" + listStr+" listSize : "+ list.size() + String.valueOf(list.get(0)));
        for(int i=0; i<list.size();i++){
            log.i("QuestionActivity_listStringSumClass_interFor","loop" + i + " : " + listStr+" listSize : "+ list.size() + "  list.get " + String.valueOf(list.get(i)));
            listStr = listStr + String.valueOf(list.get(i));
            log.i("QuestionActivity_listStringSumClass_loopup","loop" + i + " : " + listStr);
            if(i <list.size()-1){
                listStr = listStr + "!";
                log.i("QuestionActivity_listStringSumClass_loop","loop" + i + " : " + listStr);
            }

        }
        return listStr;
    }






}
