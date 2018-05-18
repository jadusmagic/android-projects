package com.calculator.acer.comcoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
String opr;
Double n1,n2,res;


    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b10 = findViewById(R.id.button10);
        b11 = findViewById(R.id.button11);
        b12 = findViewById(R.id.button12);
        b13 = findViewById(R.id.button13);
        b14 = findViewById(R.id.button14);
        b15 = findViewById(R.id.button15);
        e = findViewById(R.id.editText);

    }

        public void one(View view){
        String s = e.getText().toString();
        Double S = Double.parseDouble(s);

e.setText(S+1+"");
    }

    public void two(View view){
        String s = e.getText().toString();
        Double S = Double.parseDouble(s);

        e.setText(S+2+"");
    }
    public void three(View view){
        String s = e.getText().toString();
        Double S = Double.parseDouble(s);

        e.setText(S+3+"");
    }
    public void four(View view){
        String s = e.getText().toString();
        Double S = Double.parseDouble(s);

        e.setText(S+4+"");
    }
    public void five(View view){
        String s = e.getText().toString();
        Double S = Double.parseDouble(s);

        e.setText(S+5+"");
    }
    public void six(View view){
        String s = e.getText().toString();
        Double S = Double.parseDouble(s);

        e.setText(S+6+"");
    }
    public void seven(View view){
        String s = e.getText().toString();
        Double S = Double.parseDouble(s);

        e.setText(S+7+"");
    }
    public void eight(View view){
        String s = e.getText().toString();
        Double S = Double.parseDouble(s);

        e.setText(S+8+"");
    }
    public void nine(View view){
        String s = e.getText().toString();
        Double S = Double.parseDouble(s);

        e.setText(S+9+"");
    }

    public void zero(View view){
        String s = e.getText().toString();
        Double S = Double.parseDouble(s);

        e.setText(S+0+"");
    }
public void add (View view)
    {
        String s = e.getText().toString();
        n1 = Double.parseDouble(s);
opr=b12.getText().toString();
        e.setText(00+"");

    }
    public void sub (View view)
    {
        String s = e.getText().toString();
        n1 = Double.parseDouble(s);
        opr=b13.getText().toString();
        e.setText(00+"");

    }
    public void mul (View view)
    {
        String s = e.getText().toString();
        n1 = Double.parseDouble(s);
        opr=b14.getText().toString();
        e.setText(00+"");

    }
    public void div (View view)
    {
        String s = e.getText().toString();
        n1 = Double.parseDouble(s);
        opr=b15.getText().toString();
        e.setText(00+"");

    }
    public void equals (View view)
    {
        String s = e.getText().toString();
        n2 = Double.parseDouble(s);
       switch (opr){
           case "+" :
               res=n1+n2;
               break;
           case "-" :
               res=n1-n2;
               break;

           case "*" :
               res=n1*n2;
               break;

           case "/" :
               res=n1/n2;
               break;
       }
       e.setText(res+"");
    }


    }











