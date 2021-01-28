package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter;
    private TextView textView;
    private Button Increment,Decrement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 50;
        textView = (TextView)findViewById(R.id.textView);
        Increment = (Button)findViewById(R.id.Increment);
        Decrement = (Button)findViewById(R.id.Decrement);

        textView.setText(counter + "");
        Increment.setOnClickListener(this::onClick);
        Decrement.setOnClickListener(this::onClick);
    }
    public void onClick(View v){

        if(v.getId() == R.id.Increment){

            counter = counter + 1;
            textView.setText(counter + "");

        }
        else if(v.getId() == R.id.Decrement){

            counter = counter - 1;
            textView.setText(counter + "");

        }
    }
}