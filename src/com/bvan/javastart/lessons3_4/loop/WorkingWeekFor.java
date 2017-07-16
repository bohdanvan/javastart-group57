package com.bvan.javastart.lessons3_4.loop;

/**
 * @author bvanchuhov
 */
public class WorkingWeekFor {

    public static void main(String[] args) {
        for (int day = 1; day <= 100; day = day + 2) {
            System.out.println(day + ": Work");
        }
        System.out.println("Goodbye");
    }
}
