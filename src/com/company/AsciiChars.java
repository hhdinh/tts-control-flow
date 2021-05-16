package com.company;

public class AsciiChars {

    public static void printNumbers() {
        // print valid numeric input
        for (int i = 48; i < 58; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }

    public static void printLowerCase() {
        // print valid lowercase alphabetic input
        for (int i = 97; i < 123; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }

    public static void printUpperCase() {
        // print valid uppercase alphabetic input
        for (int i = 65; i < 91; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }
}
