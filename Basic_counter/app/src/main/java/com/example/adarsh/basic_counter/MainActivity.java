package com.example.adarsh.basic_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b,b2;
    EditText e;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        b= (Button)findViewById(R.id.button);
        b2= (Button)findViewById(R.id.button2);
        e=(EditText)findViewById(R.id.editText);
    }
    public void incr(View view){

        String s = e.getText().toString();
int x=Integer.parseInt(s);
        x=x+1;
        e.setText(x+"");

    }
    public void dcr(View view){

        String s = e.getText().toString();
        int x=Integer.parseInt(s);
        x=x-1;
        e.setText(x+"");

    }
}
