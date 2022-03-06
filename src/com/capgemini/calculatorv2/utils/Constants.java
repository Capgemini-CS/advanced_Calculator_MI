package com.capgemini.calculatorv2.utils;

public enum Constants {
    NUMBER_FILENAME("Equation.txt"),
    INPUT_NUMBERS_FILENAME("InputEquation.txt");

    private final String name;

    Constants(String s) { this.name = s;}

    public String getName() { return name;}
}
