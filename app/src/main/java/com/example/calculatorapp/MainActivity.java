package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void findSum(View view) {
        EditText valOne = (EditText)findViewById(R.id.valOne);
        EditText valTwo = (EditText)findViewById(R.id.valTwo);
        TextView numberSumTV = (TextView)findViewById(R.id.result);

        int num1 = Integer.parseInt((valOne.getText().toString()));
        int num2 = Integer.parseInt((valTwo.getText().toString()));
        int sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findDiff(View view) {
        EditText valOne = (EditText)findViewById(R.id.valOne);
        EditText valTwo = (EditText)findViewById(R.id.valTwo);
        TextView numberSumTV = (TextView)findViewById(R.id.result);

        int num1 = Integer.parseInt((valOne.getText().toString()));
        int num2 = Integer.parseInt((valTwo.getText().toString()));
        int diff = num1 - num2;

        numberSumTV.setText("" + diff);
    }

    public void findProd(View view) {
        EditText valOne = (EditText)findViewById(R.id.valOne);
        EditText valTwo = (EditText)findViewById(R.id.valTwo);
        TextView numberSumTV = (TextView)findViewById(R.id.result);

        int num1 = Integer.parseInt((valOne.getText().toString()));
        int num2 = Integer.parseInt((valTwo.getText().toString()));
        int prod = num1 * num2;

        numberSumTV.setText("" + prod);
    }


    public void findQuotient(View view) {
        EditText valOne = (EditText)findViewById(R.id.valOne);
        EditText valTwo = (EditText)findViewById(R.id.valTwo);
        TextView numberSumTV = (TextView)findViewById(R.id.result);

        int num1 = Integer.parseInt((valOne.getText().toString()));
        int num2 = Integer.parseInt((valTwo.getText().toString()));
        int quotient = num1 / num2;

        numberSumTV.setText("" + quotient);
    }




}