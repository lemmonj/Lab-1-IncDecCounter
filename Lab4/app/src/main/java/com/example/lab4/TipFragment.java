package com.example.lab4;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.EditText;

import java.text.DecimalFormat;

public class TipFragment extends Fragment {


    private EditText totalCost;
    private EditText numPeople;
    private EditText taxPercent;
    private TextView finalCost;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.tip_fragment, container, false);
        return view;

    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        totalCost = (EditText) view.findViewById(R.id.totalCost);
        numPeople = (EditText) view.findViewById(R.id.numPeople);
        taxPercent = (EditText) view.findViewById(R.id.tipPercent);
        finalCost = (TextView) view.findViewById(R.id.outputView);

        view.findViewById(R.id.button).setOnClickListener(this::onClick);
    }

    public void onClick(View view){

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

}
