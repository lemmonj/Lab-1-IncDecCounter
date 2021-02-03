package com.example.lab2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private String[] displayDialouge;
    private int rdmNumber;
    private String displayText;

    private Random random = new Random();

    private TextView instructionView,displayView;
    private Button helpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instructionView = (TextView)findViewById(R.id.instructionView);
        displayView = (TextView)findViewById(R.id.displayView);
        helpButton = (Button)findViewById(R.id.helpButton);

        displayDialouge = getResources().getStringArray(R.array.storyOptions);
        helpButton.setOnClickListener(this::onClick);
    }
    public void onClick(View v){

        displayView.setText(" ");
        rdmNumber = random.nextInt(displayDialouge.length);
        displayText = displayDialouge[rdmNumber];
        displayView.setText(displayText);

    }
}
