package com.bvan.javastart.lessons3_4.io;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonIO {

    public static void main(String[] args) throws FileNotFoundException {
        // Input
        // 1. Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // 2. Read string
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        // 3. Read int
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // 4 (optional for console). Close Scanner object
        scanner.close();

        // BL
        String message = "Hello, I'm " + name + ", "
                + age + " years old";

        // Output
        System.out.println(message);
    }
}
