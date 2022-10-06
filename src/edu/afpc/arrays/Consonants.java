package edu.afpc.arrays;

import java.util.Scanner;

/**
 * Goal: given any phrase, output to the console the number of consonants.
 */
public class Consonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase;
        int counter = 0;

        System.out.println("Please write a phrase");
        phrase = scanner.next().toLowerCase();

        for (int i = 0; i < phrase.length(); i++) {
            switch (phrase.charAt(i)) {
                case('a'):
                case('e'):
                case('i'):
                case('o'):
                case('u'):
                    continue;
                default:
                    counter++;

            }
        }

        System.out.println("The number of consonants is " + counter);
    }
}
