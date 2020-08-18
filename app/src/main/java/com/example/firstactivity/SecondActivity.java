package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView t1;
    TextView t2;
    String s1;
    String s2;
    TextView tresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t1 = findViewById(R.id.t4);
        t2 = findViewById(R.id.t7);
        tresult = findViewById(R.id.textView4);

        s1 = getIntent().getExtras().getString("value1");//Catch the inputs privious page
        s2 = getIntent().getExtras().getString("value2");

        t1.setText(s1);//Again covert into String
        t2.setText(s2);
    }
    public void addNumbers(View v1)
    {
        double no1,no2,result;
        no1 = Double.parseDouble(s1);//geting int type variable
        no2 = Double.parseDouble(s2);
        result = no1 + no2;

        tresult.setText(String.valueOf(no1+ " + "+ no2 + " = " + result));
    }
    public void addSub(View v1)
    {
        double no1,no2,result;
        no1 = Double.parseDouble(s1);
        no2 = Double.parseDouble(s2);
        result = no1 - no2;

        tresult.setText(String.valueOf(no1+ " - "+ no2 + " = " + result));
    }

    public void addMultiplication(View v1)
    {
        double no1,no2,result;
        no1 = Double.parseDouble(s1);
        no2 = Double.parseDouble(s2);
        result = no1 * no2;

        tresult.setText(String.valueOf(no1+ " * "+ no2 + " = " + result));
    }
    public void addDivision(View v1)
    {
        double no1,no2,result;
        no1 = Double.parseDouble(s1);
        no2 = Double.parseDouble(s2);
        result = no1 / no2;

        tresult.setText(String.valueOf(no1+ " / "+ no2 + " = " + result));
    }

}