package com.example.adarsh.calc_basic;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.adarsh.calc_basic.R.id.button;
import static com.example.adarsh.calc_basic.R.id.button2;
import static com.example.adarsh.calc_basic.R.id.button3;
import static com.example.adarsh.calc_basic.R.id.button4;
import static com.example.adarsh.calc_basic.R.id.num1;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4;
    EditText t1, t2;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.num1);

        t2 = findViewById(R.id.num2);
        ans = TextView.R.ViewByID(ans);
    }

    public void add(View add) {
        String n1 = t1.getText().toString();
        String n2 = t2.getText().toString();
        Double nu1 = Double.parseDouble(n1);
        Double nu2 = Double.parseDouble(n2);
        double a = nu1 + nu2;
        ans.setText(a + "");


    }

    public void sub(View sub) {
        String n1 = t1.getText().toString();
        String n2 = t2.getText().toString();
        Double nu1 = Double.parseDouble(n1);
        Double nu2 = Double.parseDouble(n2);
        double a = nu1 - nu2;
        ans.setText(a + "");

    }

    public void mul(View mul) {
        String n1 = t1.getText().toString();
        String n2 = t2.getText().toString();
        Double nu1 = Double.parseDouble(n1);
        Double nu2 = Double.parseDouble(n2);
        double a = nu1 * nu2;
        ans.setText(a + "");
    }

    public void div(View div) {
        String n1 = t1.getText().toString();
        String n2 = t2.getText().toString();
        Double nu1 = Double.parseDouble(n1);
        Double nu2 = Double.parseDouble(n2);
        double a = nu1 / nu2;
        ans.setText(a + "");
    }
}