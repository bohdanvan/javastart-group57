package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class MethodExample {

    // Client
    public static void main(String[] args) {
        int x = min(10, 30);
        System.out.println(x);
    }

    // Creator
    public static int min(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }
}
