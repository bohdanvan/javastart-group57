package com.bvan.javastart.lessons7_8.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class RepeatableReader {

    public static void main(String[] args) {
        int age = readInt("age", 0, 120);
        System.out.println(age);
    }

    public static int readInt(String valueName, int min, int max) {
        int value = readInt(valueName);
        while (value < min || value > max) {
            System.out.println("Illegal range. Should be in the range [" + min + ", " + max + "]");
            value = readInt(valueName);
        }
        return value;
    }

    public static int readInt(String valueName) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter " + valueName + ": ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // skip

            System.out.println("Sorry, illegal input");
            System.out.print("Enter " + valueName + ": ");
        }
        return scanner.nextInt();
    }
}
