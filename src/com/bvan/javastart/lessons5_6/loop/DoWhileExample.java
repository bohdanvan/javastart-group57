package com.bvan.javastart.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class DoWhileExample {

    public static void main(String[] args) {
        int n = 30;

        do {
            System.out.print(n + " ");
            n++;
        } while (n <= 10);

        System.out.println();
    }
}
