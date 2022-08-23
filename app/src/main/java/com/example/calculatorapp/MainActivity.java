package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*
    https://stackoverflow.com/questions/8961071/android-changing-background-color-of-the-activity-main-view
     */
    public void setActivityBackgroundColor(int color){
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }

    public void findSum(View view){
        EditText number1ET = findViewById(R.id.number1);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberSum = findViewById(R.id.result);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int sum = num1 + num2;
        setActivityBackgroundColor(0xfffbff05);
        numberSum.setText("" + sum);

    }
    public void findDifference(View view){
        EditText number1ET = findViewById(R.id.number1);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberDifference = findViewById(R.id.result);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int difference = num1 - num2;
        setActivityBackgroundColor(0xff61dcf2);
        numberDifference.setText("" + difference);
    }

    public void findProduct(View view){
        EditText number1ET = findViewById(R.id.number1);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberProduct = findViewById(R.id.result);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int product = num1 * num2;
        setActivityBackgroundColor(0xffa514de);
        numberProduct.setText("" + product);
    }

    public void findQuotient(View view){
        EditText number1ET = findViewById(R.id.number1);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberQuotient = findViewById(R.id.result);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        double quotient = (double) num1/num2;
        setActivityBackgroundColor(0xff9c6433);
        numberQuotient.setText("" + quotient);
    }
}