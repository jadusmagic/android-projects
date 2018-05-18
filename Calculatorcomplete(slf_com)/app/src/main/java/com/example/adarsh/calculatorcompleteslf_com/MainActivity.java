package com.example.adarsh.calculatorcompleteslf_com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    TextView e;
    double n1,n2,ans;
    String opr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);
        b11=(Button)findViewById(R.id.button11);
        b12=(Button)findViewById(R.id.button12);
        b13=(Button)findViewById(R.id.button13);
        b14=(Button)findViewById(R.id.button14);
        b15=(Button)findViewById(R.id.button15);
        b16=(Button)findViewById(R.id.button16);
        b17=(Button)findViewById(R.id.button17);
        b18=(Button)findViewById(R.id.button18);
        b19=(Button)findViewById(R.id.button19);

        e=(TextView)findViewById(R.id.textView);

    }

    public void one(View view){
        String s=e.getText().toString();
        e.setText(s+1);
    }
    public void two(View view){
        String s=e.getText().toString();
        e.setText(s+2);
    }
    public void three(View view){
        String s=e.getText().toString();
        e.setText(s+3);
    }
    public void four(View view){
        String s=e.getText().toString();
        e.setText(s+4);
    }
    public void five(View view){
        String s=e.getText().toString();
        e.setText(s+5);
    }
    public void six(View view){
        String s=e.getText().toString();
        e.setText(s+6);
    }
    public void seven(View view){
        String s=e.getText().toString();
        e.setText(s+7);
    }
    public void eight(View view){
        String s=e.getText().toString();
        e.setText(s+8);
    }
    public void nine(View view){
        String s=e.getText().toString();
        e.setText(s+9);
    }
    public void zero(View view){
        String s=e.getText().toString();
        e.setText(s+0);
    }
    public void mod(View view){
        String s=e.getText().toString();
        n1=Double.parseDouble(s);
        opr="%";
        e.setText(00+"");
    }
    public void dec(View view){
        String s=e.getText().toString();
        e.setText(s+".");
    }

    public void add(View view){
        String s=e.getText().toString();
        n1=Double.parseDouble(s);
        opr="+";
        e.setText(00+"");
    }
    public void sub(View view){
        String s=e.getText().toString();
        n1=Double.parseDouble(s);
        opr="-";
        e.setText(0+"");
    }
    public void mul(View view){
        String s=e.getText().toString();
        n1=Double.parseDouble(s);
        opr="*";
        e.setText(0+"");
    }
    public void div(View view){
        String s=e.getText().toString();
        n1=Double.parseDouble(s);
        opr="/";
        e.setText(0+"");

    }
    public void clear(View view){
        n1=0;
        n2=0;
        e.setText(00+"");
    }
    public void baclear(View view){
        String s=e.getText().toString();
        if(s.length()>=1){
            s=s.substring(0,s.length()-1);
            e.setText(s);
        }
        if(s.length()<1){
            e.setText(0+"");
        }

    }


        public void eql(View view){
        String s=e.getText().toString();
        n2=Double.parseDouble(s);
        switch (opr){
            case "+" :
                ans=n1+n2;
                break;
            case"-":
                ans=n1-n2;
                break;
            case"*":
                ans=n1*n2;
                break;
            case"/":
                ans=n1/n2;
                break;
            case"%":
                ans=n1/n2*100;
                break;
            default:
                ans=n2;
        }
        e.setText(ans+"");
    }
}
