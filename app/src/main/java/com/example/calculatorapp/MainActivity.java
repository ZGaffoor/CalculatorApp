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
}