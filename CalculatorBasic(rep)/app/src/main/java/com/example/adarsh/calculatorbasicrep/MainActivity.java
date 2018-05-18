package com.example.adarsh.calculatorbasicrep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4;
    EditText e1, e2;
    TextView e3;
    double x, y,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        e3 = (TextView)findViewById(R.id.textView);

    }

    public void num1(View view) {

    }

    public void num2(View view) {

    }

    public void add(View view) {
        String s1 = e1.getText().toString();
        x = Double.parseDouble(s1);

        String s2 = e2.getText().toString();
        y = Double.parseDouble(s2);

        z=y+x;
        Log.d("myTag",x+" "+ y+ " "+ z+"");
        e3.setText(z+"");

    }

    public void sub(View view){
        String s1 = e1.getText().toString();
        x = Double.parseDouble(s1);

        String s2 = e2.getText().toString();
        y = Double.parseDouble(s2);
        Log.d("myTag",x+" "+ y+ " "+ z+"");

        z=y-x;
        e3.setText(z+"");

    }
    public void mul(View view){
        String s1 = e1.getText().toString();
        x = Double.parseDouble(s1);

        String s2 = e2.getText().toString();
        y = Double.parseDouble(s2);
        Log.d("myTag",x+" "+ y+ " "+ z+"");

        z=x*y;
        e3.setText(z+"");
    }
    public void div(View view){
        String s1 = e1.getText().toString();
        x = Double.parseDouble(s1);

        String s2 = e2.getText().toString();
        y = Double.parseDouble(s2);
        Log.d("myTag",x+" "+ y+ " "+ z+"");

        z=x/y;
        e3.setText(z+"");
    }
}