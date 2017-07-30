package com.bvan.javastart.lessons7_8.practice;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayReader {

    public static void main(String[] args) {
        int[] array = readArray();
        System.out.println(Arrays.toString(array));
    }

    public static int[] readArray() {
        int size = RepeatableReader.readInt("size", 0, Integer.MAX_VALUE);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int elem = RepeatableReader.readInt("array[" + i + "]");
            array[i] = elem;
        }

        return array;
    }
}
