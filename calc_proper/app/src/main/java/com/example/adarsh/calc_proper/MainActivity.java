package com.example.adarsh.calc_proper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText t;
    String n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=EditText.findViewById(R.id.editText);


    }
    public void one(View one){

        String no=t.setText();
        t.setText(no+1);
    }
    public void two(View two){

        String no=t.setText();
        t.setText(no+2);
    }
    public void three(View three){

        String no=t.setText();
        t.setText(no+3);
    }
    public void four(View four){

        String no=t.setText();
        t.setText(no+4);
    }
    public void five(View five){

        String no=t.setText();
        t.setText(no+5);
    }
    public void six(View six){

        String no=t.setText();
        t.setText(no+6);
    }
    public void seven (View seven){

        String no=t.setText();
        t.setText(no+7);
    }
    public void eight(View eight){

        String no=t.setText();
        t.setText(no+8);
    }
    public void nine(View nine){

        String no=t.setText();
        t.setText(no+9);
    }
    public void zero (View zero){

        String no=t.setText();
        t.setText(no+0);
    }
    public void eql(View eql){
        n1=t.getText();
        t.setText("");

    }
    public void add(View add){
       n2= t.getText();
        Double no1=Double.parseDouble(n1);
        Double no2=Double.parseDouble(n2);

        Double ans=no1+no2;
        t.setText(ans+"");
    }
    public void sub(View sub){
        n2= t.getText();
        Double no1=Double.parseDouble(n1);
        Double no2=Double.parseDouble(n2);

        Double ans=no1+no2;
        t.setText(ans+"");
    }
    public void div(View div){
        n2= t.getText();
        Double no1=Double.parseDouble(n1);
        Double no2=Double.parseDouble(n2);

        Double ans=no1/no2;
        t.setText(ans+"");
    }
    public void mul(View mul){
        n2= t.getText();
        Double no1=Double.parseDouble(n1);
        Double no2=Double.parseDouble(n2);

        Double ans=no1*no2;
        t.setText(ans+"");
    }
}
