package com.bvan.javastart.lessons3_4.types;

/**
 * @author bvanchuhov
 */
public class CharExample {

    public static void main(String[] args) {
        String name = "Богдан";
        System.out.println(name);

        System.out.println("I ❤ Java");

        char c1 = 'a';
        char c2 = '\\';
        char c3 = '\u2764';
        char c4 = 21414;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("--");

        // "D:\\"
        System.out.println("\"D:\\\\\"");
    }
}
