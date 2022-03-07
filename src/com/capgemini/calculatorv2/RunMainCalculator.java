package com.capgemini.calculatorv2;

import com.capgemini.calculatorv2.screen.OutputScreen;
import com.capgemini.calculatorv2.calculator.Calculator;
import com.capgemini.calculatorv2.input.Key;
import com.capgemini.calculatorv2.input.Operator;
import org.tinylog.Logger;

import java.io.FileNotFoundException;

public class RunMainCalculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Key firstNumber = new Key();
        Key secondNumber = new Key();
        Operator operator = new Operator();

        int resultOfEquation = calculator.executeEquation(firstNumber.getKeyNumber(), operator.getOperatorInput(), secondNumber.getKeyNumber());
        OutputScreen outputScreen = new OutputScreen();
        outputScreen.showOutputOnScreen(resultOfEquation);

        Logger.info("baby-shark");

    }
}
