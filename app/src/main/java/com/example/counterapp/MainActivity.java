package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome, numCounter;
    Button btnAdd, btnReset, btnRest;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd   = findViewById(R.id.add);
        btnReset = findViewById(R.id.reset);
        btnRest  = findViewById(R.id.rest);
        numCounter = findViewById(R.id.textView);

        numCounter.getText();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numCounter.setText(""+add());

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numCounter.setText(""+reset());
            }
        });

        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numCounter.setText(""+rest());

            }
        });

    }

    public int add(){
        return ++counter;
    }
    public int reset(){
        return counter = 0;
    }
    public int rest(){
        return --counter;
    }
}