package com.bvan.javastart.lessons5_6.practice.drinker;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DrinkerV1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter beers: ");
        int beers = scanner.nextInt();

        System.out.println("I have " + beers + " beers");
        for (int beerIndex = 1; beerIndex <= beers; beerIndex++) {
            System.out.println("I've drunk " + beerIndex + " beer");
        }
    }
}
