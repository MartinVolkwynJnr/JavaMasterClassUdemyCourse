package com.martin;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        if (myValue > myMinIntValue && myValue < myMaxIntValue){
            System.out.println("YOUR VALUE IS VALID!");
        }

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);

        System.out.println("Integer underflow Minimum Value = " + (myMinIntValue - 1));
        System.out.println("Integer overflow Max Value = " + (myMaxIntValue + 1));


        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myByteMinValue);
        System.out.println("Byte Max Value = " + myByteMaxValue);
        System.out.println("Byte underflow Minimum Value = " + (myByteMinValue - 1));
        System.out.println("Byte overflow Max Value = " + (myByteMaxValue + 1));

        short myshortMinValue = Short.MIN_VALUE;
        short myshortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myshortMaxValue);
        System.out.println("Short Max Value = " + myshortMinValue);
        System.out.println("Short underflow Minimum Value = " + (myshortMaxValue - 1));
        System.out.println("Short overflow Max Value = " + (myshortMinValue + 1));
        
        long myLongValue = 100L;
        long mylongMinValue = Long.MIN_VALUE;
        long mylongMaxValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value = " + mylongMaxValue);
        System.out.println("long Max Value = " + mylongMinValue);
        System.out.println("long underflow Minimum Value = " + (mylongMaxValue - 1));
        System.out.println("long overflow Max Value = " + (mylongMinValue + 1));
        long LongLiteralValue = 2_147_483_647;
        long bigLongLiteralValue = 2_147_483_647_123L;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myByteMinValue / 2);
        short myNewShortValue = (short) (myshortMinValue / 2);

    }
}
