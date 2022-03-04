package com.capgemini.calculatorv2.calculator;

import com.capgemini.calculatorv2.operation.Equation;
import com.capgemini.calculatorv2.validation.IValidationNumber;

public class Divide implements Equation , IValidationNumber {
    @Override
    public int equationWithNumbers(int firstNumberOfEquation, int secondNumberOfEquation) {
        if (checkValidationNumber(secondNumberOfEquation)) {
            throw new NumberFormatException("You can't divide by 0");
        }
        return firstNumberOfEquation / secondNumberOfEquation;
    }

    @Override
    public boolean checkValidationNumber(int number) {
            return number == 0;
    }
}
