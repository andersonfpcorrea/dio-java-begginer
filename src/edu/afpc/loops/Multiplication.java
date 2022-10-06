package edu.afpc.loops;

import java.util.Scanner;

/**
 * Goal: develop a multiplication table generator for any number between 0 and 10.
 */
public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tableFor;

        System.out.println("Choose a number to see its multiplication table:");
        tableFor = scanner.nextInt();

        for (int i = 0; i < tableFor; i++) {
            System.out.println(tableFor + " X " + (i + 1) + " = " + tableFor * (i + 1));
        }


    }
}
