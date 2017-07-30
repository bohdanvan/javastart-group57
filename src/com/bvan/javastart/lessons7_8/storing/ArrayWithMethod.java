package com.bvan.javastart.lessons7_8.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayWithMethod {

    public static void main(String[] args) {
        int[] array = new int[5];
        fill(array, 1);
        System.out.println(Arrays.toString(array));
    }

    public static void fill(int[] array, int filler) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
    }
}
