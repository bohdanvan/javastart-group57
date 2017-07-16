package com.bvan.javastart.lessons5_6.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class RangeSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter from: ");
        int from = scanner.nextInt();

        System.out.print("Enter to: ");
        int to = scanner.nextInt();

        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }

        System.out.println("sum = " + sum);
    }
}
