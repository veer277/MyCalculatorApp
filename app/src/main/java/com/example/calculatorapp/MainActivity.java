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

    public void findSum(View view){
        EditText number1ET = findViewById(R.id.number1);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberSum = findViewById(R.id.result);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int sum = num1 + num2;

        numberSum.setText("" + sum);
    }
    public void findDifference(View view){
        EditText number1ET = findViewById(R.id.number1);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberDifference = findViewById(R.id.result);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int difference = num1 - num2;

        numberDifference.setText("" + difference);
    }

    public void findProduct(View view){
        EditText number1ET = findViewById(R.id.number1);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberProduct = findViewById(R.id.result);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int product = num1 * num2;

        numberProduct.setText("" + product);
    }

    public void findQuotient(View view){
        EditText number1ET = findViewById(R.id.number1);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberQuotient = findViewById(R.id.result);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        double quotient = (double) num1/num2;

        numberQuotient.setText("" + quotient);
    }
}