package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class StringMethodExample {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = ", world";

        String s3 = sum(s1, s2);

        System.out.println("s3 = " + s3);
    }

    public static String sum(String s1, String s2) {
        return s1 + s2;
    }
}
