package edu.afpc.loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = -1;

        while(grade < 0 || grade > 10) {
            System.out.println("Write a grade between 0 and 10:");
            grade = scanner.nextDouble();
        }

        System.out.println("Thanks");
    }
}
