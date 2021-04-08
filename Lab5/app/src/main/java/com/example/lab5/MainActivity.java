package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    
    private RecyclerView memoOutput;
    private Button btnAddMemo,btnDeleteMemo;
    private EditText addMemoInput,deleteMemoInput;

    private DatabaseHandler db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        memoOutput = (RecyclerView) findViewById(R.id.memoOutput);
        btnAddMemo = (Button) findViewById(R.id.btnAddMemo);
        btnDeleteMemo = (Button) findViewById(R.id.btnDeleteMemo);
        addMemoInput = (EditText) findViewById(R.id.addMemoInput);
        deleteMemoInput = (EditText) findViewById(R.id.deleteMemoInput);

        db = new DatabaseHandler(this, null, null, 1);

        updateRecyclerView();
    }
    
    public void addMemo(View v){

        db = new DatabaseHandler(this, null, null, 1);

        String memo = addMemoInput.getText().toString();
        Memo newMemo = new Memo(memo);

        db.addMemo(newMemo);

        updateRecyclerView();

    }

    public void DeleteMemo(View v){

       db = new DatabaseHandler(this, null, null, 1);

       int memoNum = Integer.parseInt(deleteMemoInput.getText().toString());

       db.deleteMemo(memoNum);

       updateRecyclerView();

    }

    private void updateRecyclerView() {

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(db.viewMemosAsList());

        memoOutput.setHasFixedSize(true);
        memoOutput.setLayoutManager(new LinearLayoutManager(this));
        memoOutput.setAdapter(adapter);

    }
}
