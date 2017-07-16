package com.bvan.javastart.lessons3_4.condition;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class WorkingWeekCondition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day (1..7): ");
        int day = scanner.nextInt();

        // && - AND
        // || - OR
        // ! - NOT

        boolean isWorkingDay = day <= 5;
        if (isWorkingDay) {
            System.out.println("Work");

            if (day >= 2 && day <= 4) {
                System.out.println("Business Lunch");
            }

            if (day == 1 || day == 3) {
                System.out.println("Beer");
            }
        } else {
            System.out.println("Friends");
        }

        System.out.println("Java Courses");
    }
}
