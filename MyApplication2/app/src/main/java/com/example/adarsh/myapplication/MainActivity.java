package com.example.adarsh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String username;
    String password;
    EditText t,t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(EditText)findViewById(R.id.editText);
        t1=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);

    }
public void login (View view){
    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
    username = t.getText().toString();
    password = t1.getText().toString();
    intent.putExtra("data", username);
    intent.putExtra("pass", password);


    startActivity(intent);

}

}
