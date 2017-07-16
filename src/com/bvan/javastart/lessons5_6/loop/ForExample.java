package com.bvan.javastart.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        for (int n = 5; n <= 10; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 10; n >= 5; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 10; n >= 0; n -= 2) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int i = 0, j = 10; i <= j; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}
