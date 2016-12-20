package com.mphannon.util.paycheckcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Paycheck extends AppCompatActivity {

    private double hours;
    private double sundayHours;
    private double overtimeHours;
    private boolean workedOvertime;
    private boolean workedNights;
    private EditText hourEntry;
    private EditText sundayEntry;
    private EditText overtimeEntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paycheck);
        hourEntry = (EditText) findViewById(R.id.editText);
        sundayEntry = (EditText) findViewById(R.id.editText2);
        System.out.println("hello world");
    }

    public void setHours() {
        String tempHours = hourEntry.getText().toString();
        hours = Double.parseDouble(tempHours);
    }

    public void setSundayHours() {
        String tempHours = sundayEntry.getText().toString();
        sundayHours = Double.parseDouble(tempHours);
    }

    public void onButtonClick(View v) {
        TextView moneyMade = (TextView) findViewById(R.id.MoneyOutput);
        setHours();
        setSundayHours();
        double total = calculateMoney();
        String totes = total + "";
        moneyMade.setText(totes);
    }

    private double calculateMoney() {
        return 10;
    }
}
