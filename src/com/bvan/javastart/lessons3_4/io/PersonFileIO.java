package com.bvan.javastart.lessons3_4.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonFileIO {

    public static void main(String[] args) throws FileNotFoundException {
        // Input
        // 1. Create Scanner object
        File file = new File("files/person.txt");
        Scanner scanner = new Scanner(file);

        // 2. Read string
        String name = scanner.next();

        // 3. Read int
        int age = scanner.nextInt();

        // 4. Close Scanner object (optional for console)
        scanner.close();

        // BL
        String message = "Hello, I'm " + name + ", "
                + age + " years old";

        // Output
        System.out.println(message);
    }
}
