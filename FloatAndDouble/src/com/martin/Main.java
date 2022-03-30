package com.martin;

public class Main {

    public static void main(String[] args) {
        float floatMinValue = Float.MIN_VALUE;
        float floatMaxValue = Float.MIN_VALUE;
        System.out.println("Float minimum value = " + floatMinValue);
        System.out.println("Float max value = " + floatMaxValue);

        double doubleMinValue = Double.MIN_VALUE;
        double doubleMaxValue = Double.MIN_VALUE;
        System.out.println("double minimum value = " + doubleMinValue);
        System.out.println("double max value = " + doubleMaxValue);

        int myIntValue = 5;
        float myFloatValue = 5.24f;
        double myDouble = 5.24d;

        float myCastedFloatValue = (float) 3.54;
    }
}
