package com.larger.acer.l;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {
TextView t;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String username=getIntent().getStringExtra("data");
        String password=getIntent().getStringExtra("pass");
        t.setText("hello"+username+"and password"+password);
    }


}
