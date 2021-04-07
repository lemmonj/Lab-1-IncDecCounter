package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    
    private TextView output;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        output = (TextView) findViewById(R.id.output);
    
    }
    
    public void getAllContacts(View v) {
        DatabaseHandler db = new DatabaseHandler(this, null, null, 1);
        String contacts = db.getAllContacts();
        output.setText(contacts);
    }
}
