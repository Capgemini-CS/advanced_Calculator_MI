package com.capgemini.calculatorv2.calculator;

import com.capgemini.calculatorv2.operation.Equation;
import com.capgemini.calculatorv2.operation.EquationGeneral;
import com.capgemini.calculatorv2.validation.IValidationOperator;

import java.util.Arrays;
import java.util.List;

public class Calculator implements EquationGeneral, IValidationOperator {

    public Calculator() {
        super();
    }

    @Override
    public int executeEquation(int key1, String operator, int key2) {
        int result = 0;
        Equation equation;
        if (checkIfOperatorIsCorrect(operator)) {
            switch (operator) {
                case "+":
                    equation = new Sum();
                    result = equation.equationWithNumbers(key1, key2);
                    break;
                case "-":
                    equation = new Subtract();
                    result = equation.equationWithNumbers(key1, key2);
                    break;
                case "*":
                    equation = new Multiply();
                    result = equation.equationWithNumbers(key1, key2);
                    break;
                case "/":
                    equation = new Divide();
                    result = equation.equationWithNumbers(key1, key2);
                    break;
            }
        }
        return result;
    }


    @Override
    public boolean checkIfOperatorIsCorrect(String operator) {
        List<String> operators = Arrays.asList("+", "-", "*", "/");
        if (operators.stream().anyMatch(op -> op.equals(operator))) {
            return true;
        } else {
            System.out.println("Your parameters is not correct");
            return false;
        }
    }
}
