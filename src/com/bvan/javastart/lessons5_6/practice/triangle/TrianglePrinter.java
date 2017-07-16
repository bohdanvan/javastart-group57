package com.bvan.javastart.lessons5_6.practice.triangle;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        int size = 4;

        // Print Triangle
        for (int length = 1; length <= size; length++) {
            // Print Line
            for (int n = 1; n <= length; n++) {
                System.out.print("X");
            }
            System.out.println();
        }

    }
}
