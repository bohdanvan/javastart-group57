package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class WithoutMethodExample {

    public static void main(String[] args) {
        int sum1 = 0;
        for (int n = 100; n <= 300; n++) {
            sum1 += n;
        }

        int sum2 = 0;
        for (int n = 300; n <= 400; n++) {
            sum2 += n;
        }

        int min;
        if (sum1 < sum2) {
            min = sum1;
        } else {
            min = sum2;
        }

        System.out.println("min = " + min);
    }
}
