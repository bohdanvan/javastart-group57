package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class Factorial {

    // Client
    public static void main(String[] args) {
        long x = factorial(4);
        long y = factorial(10);
        System.out.println(x + y); // 24
    }

    // Creator
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative arg: " + n);
        }

        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
