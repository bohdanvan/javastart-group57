package com.bvan.javastart.lessons7_8.matrix;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class MatrixExample {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8}
        };

        int elem = matrix[2][2];
        System.out.println(elem);

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
