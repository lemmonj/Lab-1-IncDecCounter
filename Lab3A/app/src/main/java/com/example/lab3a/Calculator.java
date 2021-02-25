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
            if (equalHit == true || signHit == true){
                displayBuffer = "";
                signHit = false;
                if (equalHit == true){
                    System.out.println("help4");
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
            }
            if(displayBuffer == "" && !displayBuffer.contains("0")) {
                inputBuffer.append(parent.getResources().getString(R.string._0));
                displayBuffer = displayBuffer + parent.getResources().getString(R.string._0);
            }
            else if ((displayBuffer != "" && displayBuffer.startsWith("0") == false) || decimalUsed == true ){

                inputBuffer.append(parent.getResources().getString(R.string._0));
                displayBuffer = displayBuffer + parent.getResources().getString(R.string._0);

            }

        }
        if (button.equals(parent.getResources().getString(R.string._1))) {
            if (equalHit == true || signHit == true){
                displayBuffer = "";
                signHit = false;
                if (equalHit == true){
                    System.out.println("help4");
                    inputBuffer.setLength(0);

                    displayBuffer = "";

                    Operator = "";

                    firstOperand = true;
                    secondOperand = false;
                    decimalUsed = false;
                    signHit = false;
                    equalHit = false;
                    isNegative = false;
                    firstValue = null;
                    secondValue = null;
                }
            }
            if (displayBuffer.startsWith("0") == false || decimalUsed == true) {


                inputBuffer.append(parent.getResources().getString(R.string._1));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string._1));
            }

        }
        if (button.equals(parent.getResources().getString(R.string._2))) {
            if (equalHit == true || signHit == true){
                displayBuffer = "";
                signHit = false;
                if (equalHit == true){
                    System.out.println("help4");
                    inputBuffer.setLength(0);

                    displayBuffer = "";

                    Operator = "";

                    firstOperand = true;
                    secondOperand = false;
                    decimalUsed = false;
                    signHit = false;
                    equalHit = false;
                    isNegative = false;
                    firstValue = null;
                    secondValue = null;

                }
            }

            if (displayBuffer.startsWith("0") == false || decimalUsed == true) {

                inputBuffer.append(parent.getResources().getString(R.string._2));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string._2));
            }

        }
        if (button.equals(parent.getResources().getString(R.string._3))) {
            if (equalHit == true || signHit == true){
                displayBuffer = "";
                signHit = false;
                if (equalHit == true){
                    System.out.println("help4");
                    inputBuffer.setLength(0);

                    displayBuffer = "";

                    Operator = "";

                    firstOperand = true;
                    secondOperand = false;
                    decimalUsed = false;
                    signHit = false;
                    equalHit = false;
                    isNegative = false;
                    firstValue = null;
                    secondValue = null;

                }
            }
            if (displayBuffer.startsWith("0") == false || decimalUsed == true) {

                inputBuffer.append(parent.getResources().getString(R.string._3));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string._3));
                System.out.println(inputBuffer.toString());
            }

        }
        if (button.equals(parent.getResources().getString(R.string._4))) {
            if (equalHit == true || signHit == true){
            displayBuffer = "";
                signHit = false;
                if (equalHit == true){
                    System.out.println("help4");
                    inputBuffer.setLength(0);

                    displayBuffer = "";

                    Operator = "";

                    firstOperand = true;
                    secondOperand = false;
                    decimalUsed = false;
                    signHit = false;
                    equalHit = false;
                    isNegative = false;
                    firstValue = null;
                    secondValue = null;

                }
            }
            if (displayBuffer.startsWith("0") == false || decimalUsed == true) {

                inputBuffer.append(parent.getResources().getString(R.string._4));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string._4));
            }

        }
        if (button.equals(parent.getResources().getString(R.string._5))) {
            if (equalHit == true || signHit == true){
            displayBuffer = "";
                signHit = false;
                if (equalHit == true){
                    System.out.println("help4");
                    inputBuffer.setLength(0);

                    displayBuffer = "";

                    Operator = "";

                    firstOperand = true;
                    secondOperand = false;
                    decimalUsed = false;
                    signHit = false;
                    equalHit = false;
                    isNegative = false;
                    firstValue = null;
                    secondValue = null;

                }
            }
            if (displayBuffer.startsWith("0") == false || decimalUsed == true) {

                inputBuffer.append(parent.getResources().getString(R.string._5));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string._5));
            }

        }
        if (button.equals(parent.getResources().getString(R.string._6))) {
            if (equalHit == true || signHit == true){
                displayBuffer = "";
                signHit = false;
                if (equalHit == true){
                    System.out.println("help4");
                    inputBuffer.setLength(0);

                    displayBuffer = "";

                    Operator = "";

                    firstOperand = true;
                    secondOperand = false;
                    decimalUsed = false;
                    signHit = false;
                    equalHit = false;
                    isNegative = false;
                    firstValue = null;
                    secondValue = null;

                };
            }
            if (displayBuffer.startsWith("0") == false || decimalUsed == true) {

                inputBuffer.append(parent.getResources().getString(R.string._6));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string._6));
            }

        }
        if (button.equals(parent.getResources().getString(R.string._7))) {
            if (equalHit == true || signHit == true){
                displayBuffer = "";
                signHit = false;
                if (equalHit == true){
                    System.out.println("help4");
                    inputBuffer.setLength(0);

                    displayBuffer = "";

                    Operator = "";

                    firstOperand = true;
                    secondOperand = false;
                    decimalUsed = false;
                    signHit = false;
                    equalHit = false;
                    isNegative = false;
                    firstValue = null;
                    secondValue = null;

                }
            }
            if (displayBuffer.startsWith("0") == false || decimalUsed == true) {

                inputBuffer.append(parent.getResources().getString(R.string._7));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string._7));
            }

        }
        if (button.equals(parent.getResources().getString(R.string._8))) {
            if (equalHit == true || signHit == true){
                displayBuffer = "";

                signHit = false;
                if (equalHit == true){
                    System.out.println("help4");
                    inputBuffer.setLength(0);

                    displayBuffer = "";

                    Operator = "";

                    firstOperand = true;
                    secondOperand = false;
                    decimalUsed = false;
                    signHit = false;
                    equalHit = false;
                    isNegative = false;
                    firstValue = null;
                    secondValue = null;

                }
            }
            if (displayBuffer.startsWith("0") == false || decimalUsed == true) {

                inputBuffer.append(parent.getResources().getString(R.string._8));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string._8));
            }

        }
        if (button.equals(parent.getResources().getString(R.string._9))) {

            if (displayBuffer.startsWith("0") == false || decimalUsed == true) {
                if (equalHit == true || signHit == true){
                    displayBuffer = "";
                    signHit = false;
                    if (equalHit == true){
                        System.out.println("help4");
                        inputBuffer.setLength(0);

                        displayBuffer = "";

                        Operator = "";

                        firstOperand = true;
                        secondOperand = false;
                        decimalUsed = false;
                        signHit = false;
                        equalHit = false;
                        isNegative = false;
                        firstValue = null;
                        secondValue = null;

                    }
                }
                inputBuffer.append(parent.getResources().getString(R.string._9));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string._9));
            }

        }


        if (button.equals(parent.getResources().getString(R.string.Decimal))) {
            if (decimalUsed == false && !inputBuffer.toString().contains(".")) {
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
            if (firstOperand == true && inputBuffer.toString().isEmpty() == false){
                placeHolder = new BigDecimal(inputBuffer.toString());

                placeHolder = placeHolder.negate();
                inputBuffer.setLength(0);
                inputBuffer.append(placeHolder);
                displayBuffer = placeHolder.toString();
            }
            else if ( secondOperand == true && inputBuffer.toString().isEmpty() == false){

                placeHolder = new BigDecimal(inputBuffer.toString());

                placeHolder = placeHolder.negate();
                inputBuffer.setLength(0);
                inputBuffer.append(placeHolder);
                displayBuffer = placeHolder.toString();

            }
            else if ( (secondOperand == true) && (inputBuffer.toString().isEmpty() == true)){

            }

            else if ( (firstOperand == true) && (inputBuffer.toString().isEmpty() == true)){

            }
        }

        if (button.equals(parent.getResources().getString(R.string.u221a))) {
            if (firstOperand == true && inputBuffer.length() !=  0 ){
                double placeholderTwo = Double.parseDouble(inputBuffer.toString());
                placeholderTwo = Math.pow(placeholderTwo,0.5);

                firstValue = new BigDecimal(placeholderTwo);
                displayBuffer = firstValue.toString();
                inputBuffer.setLength(0);
                firstOperand = false;
                secondOperand = true;

            }
            else if (secondOperand == true ){

                double placeholderTwo = Double.parseDouble(firstValue.toString());
                placeholderTwo = Math.pow(placeholderTwo,0.5);
                firstValue = new BigDecimal(placeholderTwo);
                displayBuffer = firstValue.toString();
                System.out.println("here");
                inputBuffer.setLength(0);

            }
        }

        if (button.equals(parent.getResources().getString(R.string.plus_sign))){
            signHit = true;
            equalHit = false;

            if (firstOperand == true) {
                if (inputBuffer.toString().isEmpty() == false ) {

                    Operator = "+";
                    firstValue = new BigDecimal(inputBuffer.toString());
                    displayBuffer = "";
                    inputBuffer.setLength(0);
                    firstOperand = false;
                    secondOperand = true;
                    decimalUsed = false;
                }
            }
            else if (firstOperand == false) {
                if(Operator == ""){
                    Operator = "+";
                    displayBuffer = "";
                    decimalUsed = false;
                }
                else if (signHit == true){
                    if (inputBuffer.toString().isEmpty() == false) {
                        System.out.println("help2");
                        secondValue = new BigDecimal(inputBuffer.toString());
                        firstValue = Solve(firstValue, secondValue, Operator);
                        inputBuffer.setLength(0);
                        displayBuffer = firstValue.toString();
                        Operator = "+";
                        System.out.println(inputBuffer.toString());
                    }
                    else{
                        Operator = "+";
                    }
                }


            }


        }

        if (button.equals(parent.getResources().getString(R.string.minus_sign))){
            signHit = true;
            equalHit = false;

                if (firstOperand == true) {
                    if (inputBuffer.toString().isEmpty() == false ) {

                        Operator = "-";
                        firstValue = new BigDecimal(inputBuffer.toString());
                        displayBuffer = "";
                        inputBuffer.setLength(0);
                        firstOperand = false;
                        secondOperand = true;
                        decimalUsed = false;
                    }
                }
                    else if (firstOperand == false) {
                        if(Operator == ""){
                            Operator = "-";
                            displayBuffer = "";
                            decimalUsed = false;
                        }
                        else if (signHit == true){
                            if (inputBuffer.toString().isEmpty() == false) {
                                System.out.println("help2");
                                secondValue = new BigDecimal(inputBuffer.toString());
                                firstValue = Solve(firstValue, secondValue, Operator);
                                inputBuffer.setLength(0);
                                displayBuffer = firstValue.toString();
                                Operator = "-";
                                System.out.println(inputBuffer.toString());
                            }
                            else{
                                Operator = "-";
                            }
                        }


                    }


        }

        if (button.equals(parent.getResources().getString(R.string.u00d7))){
            signHit = true;
            equalHit = false;

            if (firstOperand == true) {
                if (inputBuffer.toString().isEmpty() == false ) {

                    Operator = "*";
                    firstValue = new BigDecimal(inputBuffer.toString());
                    displayBuffer = "";
                    inputBuffer.setLength(0);
                    firstOperand = false;
                    secondOperand = true;
                    decimalUsed = false;
                }
            }
            else if (firstOperand == false) {
                if(Operator == ""){
                    Operator = "*";
                    displayBuffer = "";
                    decimalUsed = false;
                }
                else if (signHit == true){
                    if (inputBuffer.toString().isEmpty() == false) {
                        System.out.println("help2");
                        secondValue = new BigDecimal(inputBuffer.toString());
                        firstValue = Solve(firstValue, secondValue, Operator);
                        inputBuffer.setLength(0);
                        displayBuffer = firstValue.toString();
                        Operator = "*";
                        System.out.println(inputBuffer.toString());
                    }
                    else{
                        Operator = "*";
                    }
                }


            }


        }

        if (button.equals(parent.getResources().getString(R.string.u00f7))){
            signHit = true;
            equalHit = false;

            if (firstOperand == true) {
                if (inputBuffer.toString().isEmpty() == false ) {

                    Operator = "/";
                    firstValue = new BigDecimal(inputBuffer.toString());
                    displayBuffer = "";
                    inputBuffer.setLength(0);
                    firstOperand = false;
                    secondOperand = true;
                    decimalUsed = false;
                }
            }
            else if (firstOperand == false) {
                if(Operator == ""){
                    Operator = "/";
                    displayBuffer = "";
                    decimalUsed = false;
                }
                else if (signHit == true){
                    if (inputBuffer.toString().isEmpty() == false) {
                        System.out.println("help2");
                        secondValue = new BigDecimal(inputBuffer.toString());
                        firstValue = Solve(firstValue, secondValue, Operator);
                        inputBuffer.setLength(0);
                        displayBuffer = firstValue.toString();
                        Operator = "/";
                        System.out.println(inputBuffer.toString());
                    }
                    else{
                        Operator = "/";
                    }
                }


            }


        }


        if (button.equals(parent.getResources().getString(R.string.percent_sign))){
            signHit = true;
            equalHit = false;

            if (firstOperand == true) {
                if (inputBuffer.toString().isEmpty() == false ) {

                    Operator = "%";
                    firstValue = new BigDecimal(inputBuffer.toString());
                    displayBuffer = "";
                    inputBuffer.setLength(0);
                    firstOperand = false;
                    secondOperand = true;
                    decimalUsed = false;
                }
            }
            else if (firstOperand == false) {
                if(Operator == ""){
                    Operator = "%";
                    displayBuffer = "";
                    decimalUsed = false;
                }
                else if (signHit == true){
                    if (inputBuffer.toString().isEmpty() == false) {
                        System.out.println("help2");
                        secondValue = new BigDecimal(inputBuffer.toString());
                        firstValue = Solve(firstValue, secondValue, Operator);
                        inputBuffer.setLength(0);
                        displayBuffer = firstValue.toString();
                        Operator = "%";
                        System.out.println(inputBuffer.toString());
                    }
                    else{
                        Operator = "%";
                    }
                }


            }


        }

        if (button.equals(parent.getResources().getString(R.string.equal_sign))){
            System.out.println("help");
            if (secondOperand == true && inputBuffer.toString().isEmpty() == false) {
                System.out.println("help2");
                secondValue = new BigDecimal(inputBuffer.toString());
                firstValue = Solve(firstValue, secondValue, Operator);
                inputBuffer.setLength(0);
                displayBuffer = firstValue.toString();
                signHit = false;
                Operator = "";
                System.out.println(inputBuffer.toString());
                equalHit = true;
            }
            else {

            }

        }
    }

    public BigDecimal Solve (BigDecimal first, BigDecimal second, String sign){
        if(sign == "+"){

            first = first.add(second);
            return  first;

        }
        else if (sign == "-"){


            first = first.subtract(second);
            return first;


        }
        else if (sign == "*"){


            first = first.multiply(second);

            return first;
        }
        else if (Operator == "/"){


            first = first.divide(second, 10, (int) .5);
            return first;


        }
        else if (sign == "%"){


            first = first.remainder(second);

            return first;

        }
        else if (sign == ""){
            return first;
        }
        return first;
    }

    public String getDisplay() {
        return displayBuffer;
        //System.out.println("here");
    }
}
