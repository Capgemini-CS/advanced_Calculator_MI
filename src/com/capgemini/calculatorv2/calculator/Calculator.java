package com.capgemini.calculatorv2.calculator;

import com.capgemini.calculatorv2.iofile.IReadNumbersInputFromFile;
import com.capgemini.calculatorv2.iofile.IWriteNumbersToFile;
import com.capgemini.calculatorv2.operation.Equation;
import com.capgemini.calculatorv2.operation.EquationGeneral;
import com.capgemini.calculatorv2.validation.IValidationOperator;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.capgemini.calculatorv2.utils.Constants.INPUT_NUMBERS_FILENAME;

public class Calculator implements EquationGeneral, IValidationOperator, IReadNumbersInputFromFile {

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

    @Override
    public int readNumbersFromTxtFile() {
        String line;
        int number1 = 0;
        String operator = null;
        int number2 = 0;
        try {
            FileReader fileInputNumbers = new FileReader(INPUT_NUMBERS_FILENAME.getName());
            BufferedReader bufferedReader = new BufferedReader(fileInputNumbers);
            List<String> listWithNumbers = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                listWithNumbers.add(line);
            }
            number1 = Integer.parseInt(listWithNumbers.get(0));
            operator = listWithNumbers.get(1);
            number2 = Integer.parseInt(listWithNumbers.get(2));

            bufferedReader.close();
            for (String listNum : listWithNumbers) {
                System.out.println(listNum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return executeEquation(number1, operator, number2);
    }
}
