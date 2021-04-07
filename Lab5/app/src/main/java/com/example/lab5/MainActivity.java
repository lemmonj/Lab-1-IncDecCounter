package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    
    private TextView memoOutput;
    private Button btnAddMemo,btnDeleteMemo;
    private EditText addMemoInput,deleteMemoInput;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        memoOutput = (TextView) findViewById(R.id.memoOutput);
        btnAddMemo = (Button) findViewById(R.id.btnAddMemo);
        btnDeleteMemo = (Button) findViewById(R.id.btnDeleteMemo);
        addMemoInput = (EditText) findViewById(R.id.addMemoInput);
        deleteMemoInput = (EditText) findViewById(R.id.deleteMemoInput);

        DatabaseHandler db = new DatabaseHandler(this, null, null, 1);
        memoOutput.setText(db.getAllMemos());
    }
    
    public void addMemo(View v){

        DatabaseHandler db = new DatabaseHandler(this, null, null, 1);

        String memo = addMemoInput.getText().toString();
        Memo newMemo = new Memo(memo);

        db.addMemo(newMemo);

        memoOutput.setText(db.getAllMemos());

    }

    public void DeleteMemo(View v){

        DatabaseHandler db = new DatabaseHandler(this, null, null, 1);

        int memoNum = Integer.parseInt(deleteMemoInput.getText().toString());

        db.deleteMemo(memoNum);

        memoOutput.setText(db.getAllMemos());

    }
}
