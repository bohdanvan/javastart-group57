package com.bvan.javastart.lessons5_6.array;

/**
 * @author bvanchuhov
 */
public class ArrayMin {

    public static void main(String[] args) {
        int[] array = {20, 30, 15};

        int min = array[0];
        for (int elem : array) {
            if (min > elem) {
                min = elem;
            }
        }

        System.out.println("min = " + min);
    }
}
