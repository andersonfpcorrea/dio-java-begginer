package edu.afpc.loops;

import java.util.Scanner;

/**
 * Goal: calculate the factorial of a given number.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int factorial = 1;
        System.out.println("Choose a number to calculate its factorial: ");
        value = scanner.nextInt();

        for (int i = 0; i < value; i++) {
            factorial = factorial * (value - i);
        }

        System.out.println("The factorial of " + value + " is " + factorial);
    }
}
