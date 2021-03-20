package com.example.project1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.DecimalFormat;

public class Tip_Fragment extends Fragment implements TabFragment {

    private final String title = "Tip Calculator";

    private EditText totalCost;
    private EditText numPeople;
    private EditText taxPercent;
    private TextView finalCost;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tip_fragment_layout, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        totalCost = (EditText) view.findViewById(R.id.totalCost);
        numPeople = (EditText) view.findViewById(R.id.numPeople);
        taxPercent = (EditText) view.findViewById(R.id.tipPercent);
        finalCost = (TextView) view.findViewById(R.id.outputView);


        view.findViewById(R.id.button).setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
        double cost;
        double numberPeople;
        double tipPercent ;
        double finalCostPerPerson;
        DecimalFormat formatD = new DecimalFormat("#.##");

        try {
            cost = Double.parseDouble(totalCost.getText().toString());
            numberPeople = Double.parseDouble(numPeople.getText().toString());
            tipPercent = Double.parseDouble(taxPercent.getText().toString()) * .01;

            finalCostPerPerson = cost + (cost * tipPercent);
            finalCostPerPerson = finalCostPerPerson / numberPeople;
            finalCostPerPerson = Double.parseDouble(formatD.format(finalCostPerPerson));

            finalCost.setText("$" + finalCostPerPerson);
        }
        catch (Exception e){

            finalCost.setText("All values not entered");

        }
    }

    public String getTabTitle() { return title; }

}