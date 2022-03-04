package com.capgemini.calculatorv2.input;

import java.util.Scanner;

public class Key{

    public Key() { }

    public int getKeyNumber(){
        int key = 0;
        Scanner scanner = new Scanner(System.in);
        try{
            key = scanner.nextInt();
        } catch (NumberFormatException number) {
            System.out.println(number);
        }
        return key;
    }
}
