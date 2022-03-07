package com.capgemini.calculatorv2.iofile;

import java.io.*;

public interface IWriteNumbersToFile {

    int saveNumbersInTxtFile(int firstNumber, String operator, int secondNumber);
}
