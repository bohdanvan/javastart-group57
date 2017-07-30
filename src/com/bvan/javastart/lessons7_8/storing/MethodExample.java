package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class MethodExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = sum(a, b);
        System.out.println(sum); // 30
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
