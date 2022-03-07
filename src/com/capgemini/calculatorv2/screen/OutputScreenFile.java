package com.capgemini.calculatorv2.screen;

import com.capgemini.calculatorv2.calculator.Calculator;
import com.capgemini.calculatorv2.iofile.IWriteNumbersToFile;
import com.capgemini.calculatorv2.operation.EquationGeneral;
import org.tinylog.Logger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import static com.capgemini.calculatorv2.utils.Constants.NUMBER_FILENAME;

public class OutputScreenFile extends  Calculator implements IWriteNumbersToFile, EquationGeneral {

    @Override
    public int saveNumbersInTxtFile(int firstNumber, String operator, int secondNumber){
        FileOutputStream fileOutputStream;       int result = 0;
        try {
            fileOutputStream = new FileOutputStream(NUMBER_FILENAME.getName());
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            printWriter.println(firstNumber);
            printWriter.println(operator);
            printWriter.println(secondNumber);
            result = executeEquation(firstNumber, operator, secondNumber);
            printWriter.println(result);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Logger.info("Succes. Your result is " + result );
        return result;
    }
}
