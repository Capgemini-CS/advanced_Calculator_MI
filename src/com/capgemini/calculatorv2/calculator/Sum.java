package com.capgemini.calculatorv2.calculator;

import com.capgemini.calculatorv2.operation.Equation;

public class Sum implements Equation {

    @Override
    public int equationWithNumbers(int firstNumberOfEquation, int secondNumberOfEquation) {
        return firstNumberOfEquation + secondNumberOfEquation;
    }
}
