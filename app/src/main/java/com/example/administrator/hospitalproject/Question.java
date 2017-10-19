package com.example.administrator.hospitalproject;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;
import android.view.View.OnClickListener;

import java.util.LinkedList;


public class Question extends AppCompatActivity implements OnClickListener {

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


    private LinkedList<Object> sxStateArray = new LinkedList<Object>();
    private LinkedList<Object> deptStateArray = new LinkedList<Object>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        boolean temp;

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





    }


    @Override
    public void onClick(View v) {
        String  temp;
        switch (v.getId()) {

            case R.id.deptBtn1:
                    if (deptBtn1.isChecked()) {
                        deptBtn1.setTextColor(Color.BLACK);
                        deptStateArray.add(R.id.deptBtn1);

                    } else {
                       NodeRemove(deptStateArray, deptBtn1, R.id.deptBtn1);
                        deptBtn1.setTextColor(Color.RED);
                    }
                    break;
            case R.id.deptBtn2:
                if (deptBtn2.isChecked()) {
                    deptBtn2.setTextColor(Color.BLACK);
                    deptStateArray.add(R.id.deptBtn2);

                } else {
                    NodeRemove(deptStateArray, deptBtn2, R.id.deptBtn2);
                    deptBtn2.setTextColor(Color.RED);
                }
                break;
            case R.id.deptBtn3:
                if (deptBtn3.isChecked()) {
                    deptBtn3.setTextColor(Color.BLACK);
                    deptStateArray.add(R.id.deptBtn3);

                } else {
                    NodeRemove(deptStateArray, deptBtn3, R.id.deptBtn3);
                    deptBtn3.setTextColor(Color.RED);
                }
                break;
            case R.id.deptBtn4:
                if (deptBtn4.isChecked()) {
                    deptBtn4.setTextColor(Color.BLACK);
                    deptStateArray.add(R.id.deptBtn4);

                } else {
                    NodeRemove(deptStateArray, deptBtn4, R.id.deptBtn4);
                    deptBtn4.setTextColor(Color.RED);
                }
                break;
            case R.id.deptBtn5:
                if (deptBtn5.isChecked()) {
                    deptBtn5.setTextColor(Color.BLACK);
                    deptStateArray.add(R.id.deptBtn5);

                } else {
                    NodeRemove(deptStateArray, deptBtn5, R.id.deptBtn5);
                    deptBtn5.setTextColor(Color.RED);
                }
                break;
            case R.id.deptBtn6:
                if (deptBtn6.isChecked()) {
                    deptBtn6.setTextColor(Color.BLACK);
                    BtnStateArray.add(R.id.deptBtn6);

                } else {
                    NodeRemove(deptBtn6,R.id.deptBtn6);
                    deptBtn5.setTextColor(Color.RED);
                }
                break;
            case R.id.deptBtn7:
                if (deptBtn7.isChecked()) {
                    deptBtn7.setTextColor(Color.BLACK);
                    BtnStateArray.add(R.id.deptBtn7);

                } else {
                    NodeRemove(deptBtn7,R.id.deptBtn7);
                    deptBtn7.setTextColor(Color.RED);
                }
                break;
            case R.id.deptBtn8:
                if (deptBtn8.isChecked()) {
                    deptBtn8.setTextColor(Color.BLACK);
                    BtnStateArray.add(R.id.deptBtn8);

                } else {
                    NodeRemove(deptBtn8,R.id.deptBtn8);
                    deptBtn8.setTextColor(Color.RED);
                }
                break;
            case R.id.deptBtn9:
                if (deptBtn9.isChecked()) {
                    deptBtn9.setTextColor(Color.BLACK);
                    BtnStateArray.add(R.id.deptBtn9);

                } else {
                    NodeRemove(deptBtn9,R.id.deptBtn9);
                    deptBtn9.setTextColor(Color.RED);
                }
                break;
            case R.id.deptBtn10:
                if (deptBtn10.isChecked()) {
                    deptBtn10.setTextColor(Color.BLACK);
                    BtnStateArray.add(R.id.deptBtn10);

                } else {
                    NodeRemove(deptBtn10,R.id.deptBtn10);
                    deptBtn10.setTextColor(Color.RED);
                }
                break;
            case R.id.deptBtn11:
                if (deptBtn11.isChecked()) {
                    deptBtn11.setTextColor(Color.BLACK);
                    BtnStateArray.add(R.id.deptBtn11);

                } else {
                    NodeRemove(deptBtn11,R.id.deptBtn11);
                    deptBtn11.setTextColor(Color.RED);
                }
                break;
            case R.id.deptBtn12:
                if (deptBtn12.isChecked()) {
                    deptBtn12.setTextColor(Color.BLACK);
                    BtnStateArray.add(R.id.deptBtn12);

                } else {
                    NodeRemove(deptBtn12,R.id.deptBtn12);
                    deptBtn12.setTextColor(Color.RED);
                }
                break;
            case R.id.deptBtn13:
                if (deptBtn13.isChecked()) {
                    deptBtn13.setTextColor(Color.BLACK);
                    BtnStateArray.add(R.id.deptBtn13);

                } else {
                    NodeRemove(deptBtn13,R.id.deptBtn13);
                    deptBtn13.setTextColor(Color.RED);
                }
                break;
            case R.id.deptBtn14:
                if (deptBtn14.isChecked()) {
                    deptBtn14.setTextColor(Color.BLACK);
                    BtnStateArray.add(R.id.deptBtn14);

                } else {
                    NodeRemove(deptBtn14,R.id.deptBtn14);
                    deptBtn14.setTextColor(Color.RED);
                }
                break;
            case R.id.deptBtn15:
                if (deptBtn15.isChecked()) {
                    deptBtn15.setTextColor(Color.BLACK);
                    BtnStateArray.add(R.id.deptBtn15);

                } else {
                    NodeRemove(deptBtn15,R.id.deptBtn15);
                    deptBtn15.setTextColor(Color.RED);
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





}
