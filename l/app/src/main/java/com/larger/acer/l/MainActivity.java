package com.larger.acer.l;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    String username;
    String password;
    TextView t,t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.textView);

        t1 = findViewById(R.id.textView2);

    }

    public void Login(View view) {

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        username = t.getText().toString();
        password = t1.getText().toString();
        intent.putExtra("data", username);
        intent.putExtra("pass", password);


        startActivity(intent);
    }
}




