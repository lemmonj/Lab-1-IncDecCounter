package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.math.BigDecimal;

public class Calculator {

    private Fragment parent;


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


    public Calculator(Fragment parent) {
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
        if (button.equals(parent.getResources().getString(R.string.btn_0))) {
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
                inputBuffer.append(parent.getResources().getString(R.string.btn_0));
                displayBuffer = displayBuffer + parent.getResources().getString(R.string.btn_0);
            }
            else if ((displayBuffer != "" && displayBuffer.startsWith("0") == false) || decimalUsed == true ){

                inputBuffer.append(parent.getResources().getString(R.string.btn_0));
                displayBuffer = displayBuffer + parent.getResources().getString(R.string.btn_0);

            }

        }
        if (button.equals(parent.getResources().getString(R.string.btn_1))) {
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


                inputBuffer.append(parent.getResources().getString(R.string.btn_1));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string.btn_1));
            }

        }
        if (button.equals(parent.getResources().getString(R.string.btn_2))) {
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

                inputBuffer.append(parent.getResources().getString(R.string.btn_2));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string.btn_2));
            }

        }
        if (button.equals(parent.getResources().getString(R.string.btn_3))) {
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

                inputBuffer.append(parent.getResources().getString(R.string.btn_3));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string.btn_3));
                System.out.println(inputBuffer.toString());
            }

        }
        if (button.equals(parent.getResources().getString(R.string.btn_4))) {
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

                inputBuffer.append(parent.getResources().getString(R.string.btn_4));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string.btn_4));
            }

        }
        if (button.equals(parent.getResources().getString(R.string.btn_5))) {
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

                inputBuffer.append(parent.getResources().getString(R.string.btn_5));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string.btn_5));
            }

        }
        if (button.equals(parent.getResources().getString(R.string.btn_6))) {
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

                inputBuffer.append(parent.getResources().getString(R.string.btn_6));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string.btn_6));
            }

        }
        if (button.equals(parent.getResources().getString(R.string.btn_7))) {
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

                inputBuffer.append(parent.getResources().getString(R.string.btn_7));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string.btn_7));
            }

        }
        if (button.equals(parent.getResources().getString(R.string.btn_8))) {
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

                inputBuffer.append(parent.getResources().getString(R.string.btn_8));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string.btn_8));
            }

        }
        if (button.equals(parent.getResources().getString(R.string.btn_9))) {

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
                inputBuffer.append(parent.getResources().getString(R.string.btn_9));
                displayBuffer = displayBuffer + (parent.getResources().getString(R.string.btn_9));
            }

        }


        if (button.equals(parent.getResources().getString(R.string.btnDecimal))) {
            if (decimalUsed == false && !inputBuffer.toString().contains(".")) {
                inputBuffer.append(parent.getResources().getString(R.string.btnDecimal));
                displayBuffer += (parent.getResources().getString(R.string.btnDecimal));
                decimalUsed = true;
            }
            else{

            }
        }

        if (button.equals(parent.getResources().getString(R.string.btnc))) {
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

        if (button.equals(parent.getResources().getString(R.string.btnu00b1))) {
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

        if (button.equals(parent.getResources().getString(R.string.btnu221a))) {
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

        if (button.equals(parent.getResources().getString(R.string.btnplus_sign))){
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

        if (button.equals(parent.getResources().getString(R.string.btnminus_sign))){
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

        if (button.equals(parent.getResources().getString(R.string.btnu00d7))){
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

        if (button.equals(parent.getResources().getString(R.string.btnu00f7))){
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


        if (button.equals(parent.getResources().getString(R.string.btnpercent_sign))){
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

        if (button.equals(parent.getResources().getString(R.string.btnequal_sign))){
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
