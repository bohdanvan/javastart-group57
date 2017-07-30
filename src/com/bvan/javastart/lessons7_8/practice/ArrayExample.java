package com.bvan.javastart.lessons7_8.practice;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] array = {40, 70, 50};

        for (int elem : array) {
            System.out.println(elem);
        }

        System.out.println(Arrays.toString(array));
    }
}
