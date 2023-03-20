package com.example.olio_ohjelmointi_viikko8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumber;
    private EditText secondNumber;
    private Button additionButton;
    private Button subtractionButton;
    private Button multiplicationButton;
    private Button divisionButton;
    private TextView answerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = (EditText) findViewById(R.id.firstNumber);
        secondNumber = (EditText) findViewById(R.id.secondNumber);
        additionButton = (Button) findViewById(R.id.additionButton);
        subtractionButton = (Button) findViewById(R.id.subtractionButton);
        multiplicationButton = (Button) findViewById(R.id.multiplicationButton);
        divisionButton = (Button) findViewById(R.id.divisionButton);
        answerTextView = (TextView) findViewById(R.id.answerTextView);
        addition();
        subtraction();
        multiplication();
        division();
    }

    public void addition() {
        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int answer = Integer.parseInt(firstNumber.getText().toString()) + Integer.parseInt(secondNumber.getText().toString());
                answerTextView.setText(new Integer(answer).toString());
            }
        });
    }

    public void subtraction() {
        subtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int answer = Integer.parseInt(firstNumber.getText().toString()) - Integer.parseInt(secondNumber.getText().toString());
                answerTextView.setText(new Integer(answer).toString());
            }
        });
    }

    public void multiplication() {
        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int answer = Integer.parseInt(firstNumber.getText().toString()) * Integer.parseInt(secondNumber.getText().toString());
                answerTextView.setText(new Integer(answer).toString());
            }
        });
    }

    public void division() {
        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double answer = (double) Integer.parseInt(firstNumber.getText().toString()) / (double) Integer.parseInt(secondNumber.getText().toString());
                answerTextView.setText(new Double(answer).toString());
            }
        });
    }
}