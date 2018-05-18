package com.example.adarsh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText t1,t2;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=EditText.R.ViewByID();
        t2=EditText.R.ViewByID();
        b=Button.R.ViewByID();

    }
    public void login(View view){

String em text= t1.setText();

Intent i=new Intent(MainActivity.this,Main2Activity.class);
startActivity(i);
    }

    }
}
