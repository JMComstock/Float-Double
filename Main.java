package com.company;

public class Main {

    public static void main(String[] args) {
	    // single precision occupies 32 bits and has a width of 32
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        // double precision occupies 64 bits and has a width of 64
        // double is the preferred method to use, modern day computers can process the computation faster than using a float
        // JAVA libraries math functions are mostly written to process doubles and not floats
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00d / 3.00d;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        double poundsToConvert = 555d;
        double conversionFunction = 0.45359237d * poundsToConvert;
        System.out.println(poundsToConvert + " pounds is " + conversionFunction + " kilograms");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
