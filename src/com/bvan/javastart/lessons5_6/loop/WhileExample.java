package com.bvan.javastart.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class WhileExample {

    public static void main(String[] args) {
        int n = 30; // (1)
        while (n <= 20) { // (2)
            System.out.print(n + " ");
            n += 2; // (3)
        }
        System.out.println();
    }
}
