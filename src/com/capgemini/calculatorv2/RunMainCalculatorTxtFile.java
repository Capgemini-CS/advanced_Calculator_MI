package com.capgemini.calculatorv2;

import com.capgemini.calculatorv2.calculator.Calculator;
import com.capgemini.calculatorv2.input.Key;
import com.capgemini.calculatorv2.input.Operator;
import com.capgemini.calculatorv2.screen.OutputScreen;

import java.io.FileNotFoundException;

public class RunMainCalculatorTxtFile {
    public static void main(String[] args) throws FileNotFoundException {
        Calculator calculator = new Calculator();

        Key firstNumber = new Key();
        Key secondNumber = new Key();
        Operator operator = new Operator();

        OutputScreen outputScreen = new OutputScreen();
        outputScreen.showOutputOnScreen(calculator.saveNumbersInTxtFile(firstNumber.getKeyNumber(), operator.getOperatorInput(), secondNumber.getKeyNumber()));

    }
}
