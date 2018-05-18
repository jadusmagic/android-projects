package com.example.acer.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView t;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=findViewById(R.id.counterButton);
        t=findViewById(R.id.textView);
    }

    public void counter(View view) {
        String s = t.getText().toString();
        int i = parseInt(s);
        i++;


        Toast.makeText(this, "counter", Toast.LENGTH_SHORT).show();

        t.setText(i + "");
    }
    public void reset(View view){
        String s1 = t.getText().toString();
int i1 = 00;
        Toast.makeText(this, "reset", Toast.LENGTH_SHORT).show();
          t.setText(i1+"");


    }
}

