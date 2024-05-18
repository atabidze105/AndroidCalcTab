package com.example.androidcalctab;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    String firstOperand;
    String secondOperand;

    EditText editText;
    TextView textPreviously;
    Button button_0;
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;
    Button button_plus;
    Button button_minus;
    Button button_mult;
    Button button_division;
    Button button_dot;
    Button button_symChange;
    Button button_persent;
    Button button_equal;
    Button button_brackets;
    Button button_clear;
    Button button_backspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextText);
        textPreviously = findViewById(R.id.textPreviously);
        button_0 = findViewById(R.id.button_0);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_backspace = findViewById(R.id.button_backspace);
        button_clear = findViewById(R.id.button_clear);
        button_symChange = findViewById(R.id.button_symChange);
        button_plus = findViewById(R.id.button_plus);
        button_minus = findViewById(R.id.button_minus);
        button_mult = findViewById(R.id.button_mult);
        button_division = findViewById(R.id.button_division);
        button_persent = findViewById(R.id.button_persent);
        button_dot = findViewById(R.id.button_dot);
        button_equal = findViewById(R.id.button_equal);



        button_0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        button_1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        button_2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        button_3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        button_4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        button_5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        button_6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        button_7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        button_8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        button_9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        button_backspace.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String clearT  = editText.getText().toString().equals("0") ? "" : editText.getText().toString();
                editText.setText(clearT, TextView.BufferType.EDITABLE);
                if (!editText.getText().toString().equals("")){
                    editText.setText(editText.getText().toString().substring(0, editText.getText().toString().length() - 1), TextView.BufferType.EDITABLE);
                }
                String clearTafter  = editText.getText().toString().equals("") ? "0" : editText.getText().toString();
                editText.setText(clearTafter, TextView.BufferType.EDITABLE);
            }
        });
        button_clear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("", TextView.BufferType.EDITABLE);
                String clearTafter  = editText.getText().toString().equals("") ? "0" : editText.getText().toString();
                editText.setText(clearTafter, TextView.BufferType.EDITABLE);
                textPreviously.setText("", TextView.BufferType.EDITABLE);
                firstOperand = secondOperand = null;
            }
        });

        button_dot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String clearT  = editText.getText().toString().equals("0") ? "" : editText.getText().toString();
                editText.setText(clearT, TextView.BufferType.EDITABLE);
                if(!editText.getText().toString().contains(".")){
                    if(editText.getText().toString().equals("")){
                        editText.setText(editText.getText()+"0.", TextView.BufferType.EDITABLE);
                    }
                    else{
                        editText.setText(editText.getText()+".", TextView.BufferType.EDITABLE);
                    }
                }
            }
        });

        button_symChange.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText.getText().toString().equals("0") && !editText.getText().toString().equals("0.")){
                    char sym = editText.getText().toString().charAt(0);
                    String string = sym == '-' ? editText.getText().toString().substring(1) : "-" + editText.getText().toString();
                    editText.setText(string, TextView.BufferType.EDITABLE);
                }
            }
        });

        button_persent.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!editText.getText().toString().equals("0") && !editText.getText().toString().equals("0.")){
                    String a = editText.getText().toString();
                    double s = Integer.parseInt(a) /100;
                    editText.setText(String.valueOf(s));
                }
            }
        });

        button_plus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                Operation(s);
            }
        });

        button_minus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                Operation(s);
            }
        });

        button_mult.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                Operation(s);
            }
        });

        button_division.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                Operation(s);
            }
        });
    }
    public void PrintNumber(String btn){
        String clearT  = editText.getText().toString().equals("0") ? "" : editText.getText().toString();
        switch (btn){
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                editText.setText(clearT, TextView.BufferType.EDITABLE);
                editText.setText(editText.getText()+btn, TextView.BufferType.EDITABLE);
                break;

        }
    }
    public void Operation(String btn){
        if (textPreviously.getText().toString().isEmpty()){
            firstOperand = editText.getText().toString();
            switch (btn){
                case "+":
                case "-":
                case "/":
                case "*":
                    textPreviously.setText(editText.getText().toString() + " " + btn, TextView.BufferType.EDITABLE);
                    break;
                case "=":
                    if(!textPreviously.getText().toString().equals("")){
                        secondOperand = firstOperand;
                        Equal();
                    }
                    break;
            }
        }
        else {
            secondOperand = editText.getText().toString();
            Equal();
        }
    }
    public void Equal(){
        double num1 = Double.valueOf(firstOperand);
        double num2 = Double.valueOf(secondOperand);
        double equation = 0;
        switch (textPreviously.getText().toString().charAt(textPreviously.getText().toString().length()-1)){
            case '+':
                equation = num1 + num2;
                break;
            case '-':
                equation = num1 - num2;
                break;
            case '*':
                equation = num1 * num2;
                break;
            case '/':
                equation = num1 / num2;
                break;
        }
        editText.setText(String.valueOf(equation),TextView.BufferType.EDITABLE);
    }
}