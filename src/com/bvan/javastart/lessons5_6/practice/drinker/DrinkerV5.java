package com.bvan.javastart.lessons5_6.practice.drinker;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DrinkerV5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter drinkers: ");
        int drinkers = scanner.nextInt();

        System.out.print("Enter beers: ");
        int beers = scanner.nextInt();

        for (int drinker = 1; drinker <= drinkers; drinker++) {
            System.out.println("I'm " + drinker + " drinker");

            System.out.println("I have " + beers + " beers");
            for (int beerIndex = 1; beerIndex <= beers; beerIndex++) {
                System.out.println("I've drunk " + beerIndex + " beer");
            }

            System.out.println();
        }
    }
}
