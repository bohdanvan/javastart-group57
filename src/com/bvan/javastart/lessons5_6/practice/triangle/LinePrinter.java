package com.bvan.javastart.lessons5_6.practice.triangle;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class LinePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = scanner.nextInt();

        for (int n = 1; n <= length; n++) {
            System.out.print("X");
        }
        System.out.println();
    }
}
