package com.capgemini.calculatorv2.screen;

public class OutputScreen implements IScreen{

    @Override
    public void showOutputOnScreen(int result) {
        System.out.println("Your result is : " + result);
    }
}
