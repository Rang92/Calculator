package com.example.rang.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalcMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_main);
    }

    public void onButtonClick(View v) {
        EditText n1 = (EditText) findViewById(R.id.num1);
        EditText n2 = (EditText) findViewById(R.id.num2);

        boolean zero = false; // no division by zero error

        // text view for result
        TextView result = (TextView) findViewById(R.id.result);

        double num1, num2, ans;

        num1 = Double.parseDouble(n1.getText().toString());
        num2 = Double.parseDouble(n2.getText().toString());
        ans = 0;

        if (v.getId() == R.id.plusB)
            ans = num1 + num2;
        if (v.getId() == R.id.minusB)
            ans = num1 - num2;
        if (v.getId() == R.id.timesB)
            ans = num1 * num2;
        if (v.getId() == R.id.divideB)
            if (num2 == 0)
                zero = true; // division by zero error
            else
                ans = num1 / num2;

        result.setText(ans + "");
    }}

