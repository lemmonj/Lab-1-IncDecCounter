package com.example.lab3a;

import androidx.appcompat.app.AppCompatActivity;
import java.math.BigDecimal;
import java.util.function.BiFunction;


public class Calculator {

    private AppCompatActivity parent;

    private StringBuilder inputBuffer;
    private String displayBuffer;

    private boolean firstOperand;
    private boolean secondOperand;
    private boolean decimalUsed;
    private boolean signHit;
    private boolean equalHit;
    private boolean isNegative;

    private String Operator;

    private BigDecimal firstValue;
    private BigDecimal secondValue;
    private BigDecimal placeHolder;


    public Calculator(AppCompatActivity parent) {
        this.parent = parent;

        inputBuffer = new StringBuilder();
        inputBuffer.setLength(0);

        displayBuffer = "";

        Operator = "";

        firstOperand = true;
        secondOperand = false;
        decimalUsed = false;
        signHit = false;
        equalHit = false;
        isNegative = false;
    }

    public void process(String button) {
        if (button.equals(parent.getResources().getString(R.string._0))) {
            if(displayBuffer != "") {
                inputBuffer.append(parent.getResources().getString(R.string._0));
                displayBuffer = displayBuffer + parent.getResources().getString(R.string._0);
            }

        }
        if (button.equals(parent.getResources().getString(R.string._1))) {

            inputBuffer.append(parent.getResources().getString(R.string._1));
            displayBuffer = displayBuffer + (parent.getResources().getString(R.string._1));

        }
        if (button.equals(parent.getResources().getString(R.string._2))) {

            inputBuffer.append(parent.getResources().getString(R.string._2));
            displayBuffer = displayBuffer + (parent.getResources().getString(R.string._2));

        }
        if (button.equals(parent.getResources().getString(R.string._3))) {

            inputBuffer.append(parent.getResources().getString(R.string._3));
            displayBuffer = displayBuffer + (parent.getResources().getString(R.string._3));

        }
        if (button.equals(parent.getResources().getString(R.string._4))) {

            inputBuffer.append(parent.getResources().getString(R.string._4));
            displayBuffer = displayBuffer + (parent.getResources().getString(R.string._4));

        }
        if (button.equals(parent.getResources().getString(R.string._5))) {

            inputBuffer.append(parent.getResources().getString(R.string._5));
            displayBuffer = displayBuffer + (parent.getResources().getString(R.string._5));

        }
        if (button.equals(parent.getResources().getString(R.string._6))) {

            inputBuffer.append(parent.getResources().getString(R.string._6));
            displayBuffer = displayBuffer + (parent.getResources().getString(R.string._6));

        }
        if (button.equals(parent.getResources().getString(R.string._7))) {

            inputBuffer.append(parent.getResources().getString(R.string._7));
            displayBuffer = displayBuffer + (parent.getResources().getString(R.string._7));

        }
        if (button.equals(parent.getResources().getString(R.string._8))) {

            inputBuffer.append(parent.getResources().getString(R.string._8));
            displayBuffer = displayBuffer + (parent.getResources().getString(R.string._8));

        }
        if (button.equals(parent.getResources().getString(R.string._9))) {

            inputBuffer.append(parent.getResources().getString(R.string._9));
            displayBuffer = displayBuffer + (parent.getResources().getString(R.string._9));

        }


        if (button.equals(parent.getResources().getString(R.string.Decimal))) {
            if (decimalUsed == false) {
                inputBuffer.append(parent.getResources().getString(R.string.Decimal));
                displayBuffer += (parent.getResources().getString(R.string.Decimal));
                decimalUsed = true;
            }
            else{

            }
        }

        if (button.equals(parent.getResources().getString(R.string.c))) {
            inputBuffer.setLength(0);

            displayBuffer = "";
            Operator = "";

            firstOperand = true;
            secondOperand = false;
            decimalUsed = false;
            signHit = false;
            equalHit = false;
            isNegative = false;

        }

        if (button.equals(parent.getResources().getString(R.string.u00b1))) {
            if (firstOperand == true && inputBuffer != null){
                placeHolder = new BigDecimal(inputBuffer.toString());

                placeHolder = placeHolder.negate();
                inputBuffer.setLength(0);
                inputBuffer.append(placeHolder);
                displayBuffer = placeHolder.toString();
            }
            else if ( secondOperand == true && inputBuffer != null){

                placeHolder = new BigDecimal(inputBuffer.toString());

                placeHolder = placeHolder.negate();
                inputBuffer.setLength(0);
                inputBuffer.append(placeHolder);
                displayBuffer = placeHolder.toString();

            }
            else if ( (secondOperand == true) && (inputBuffer.length() == 0)){

            }

            else if ( (secondOperand == false) && (inputBuffer.length() == 0)){

            }
        }

        if (button.equals(parent.getResources().getString(R.string.u221a))) {
            if (firstOperand == true){
                double placeholderTwo = Double.parseDouble(inputBuffer.toString());
                placeholderTwo = Math.pow(placeholderTwo,0.5);

                firstValue = new BigDecimal(placeholderTwo);
                displayBuffer = firstValue.toString();
                inputBuffer = new StringBuilder();
                firstOperand = false;
                secondOperand = true;
            }
            else if (secondOperand == true){

            }
        }

        if (button.equals(parent.getResources().getString(R.string.plus_sign))){
            if(Operator == ""){
                signHit = true;
                Operator = "+";
                firstValue = new BigDecimal(inputBuffer.toString());
                displayBuffer = "";
                inputBuffer.setLength(0);
                firstOperand = false;
                secondOperand = true;
            }
        }

        if (button.equals(parent.getResources().getString(R.string.minus_sign))){
            if(Operator == ""){
                signHit = true;
                Operator = "-";
                firstValue = new BigDecimal(inputBuffer.toString());
                displayBuffer = "";
                inputBuffer.setLength(0);
                firstOperand = false;
                secondOperand = true;
            }
        }

        if (button.equals(parent.getResources().getString(R.string.u00d7))){
            if(Operator == ""){
                signHit = true;
                Operator = "*";
                firstValue = new BigDecimal(inputBuffer.toString());
                displayBuffer = "";
                inputBuffer.setLength(0);
                firstOperand = false;
                secondOperand = true;
            }
        }

        if (button.equals(parent.getResources().getString(R.string.u00f7))){
            if(Operator == ""){
                signHit = true;
                Operator = "/";
                firstValue = new BigDecimal(inputBuffer.toString());
                displayBuffer = "";
                inputBuffer.setLength(0);
                firstOperand = false;
                secondOperand = true;
            }
        }

        if (button.equals(parent.getResources().getString(R.string.percent_sign))){
            if(Operator == ""){
                signHit = true;
                Operator = "%";
                firstValue = new BigDecimal(inputBuffer.toString());
                displayBuffer = "";
                inputBuffer.setLength(0);
                firstOperand = false;
                secondOperand = true;
            }
        }

        if (button.equals(parent.getResources().getString(R.string.equal_sign))){
            if(Operator == "+"){

                Operator = "";
                secondValue = new BigDecimal(inputBuffer.toString());
                firstValue = firstValue.add(secondValue);
                displayBuffer = firstValue.toString();
                inputBuffer.append(firstValue.toString());

            }
            else if (Operator == "-"){

                Operator = "";
                secondValue = new BigDecimal(inputBuffer.toString());
                firstValue = firstValue.subtract(secondValue);
                displayBuffer = firstValue.toString();
                inputBuffer.append(firstValue.toString());

            }
            else if (Operator == "*"){

                Operator = "";
                secondValue = new BigDecimal(inputBuffer.toString());
                firstValue = firstValue.multiply(secondValue);
                displayBuffer = firstValue.toString();
                inputBuffer.append(firstValue.toString());

            }
            else if (Operator == "/"){

                Operator = "";
                secondValue = new BigDecimal(inputBuffer.toString());
                firstValue = firstValue.divide(secondValue);
                displayBuffer = firstValue.toString();
                inputBuffer.append(firstValue.toString());

            }
            else if (Operator == "%"){

                Operator = "";
                secondValue = new BigDecimal(inputBuffer.toString());
                firstValue = firstValue.remainder(secondValue);
                displayBuffer = firstValue.toString();
                inputBuffer.append(firstValue.toString());

            }
        }
    }

    public String getDisplay() {
        return displayBuffer;
        //System.out.println("here");
    }
}
