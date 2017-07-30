package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class CharsCounter {

    public static void main(String[] args) {
        String s = "Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few";
        int countA = countChars(s, 'a');
        int countB = countChars(s, 'b');
        System.out.println("countA = " + countA);
        System.out.println("countB = " + countB);
    }

    public static int countChars(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
