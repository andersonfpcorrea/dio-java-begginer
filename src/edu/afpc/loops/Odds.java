package edu.afpc.loops;

import java.util.Scanner;

public class Odds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = 3;
        int pars = 0;
        int odds = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Write an integer:");
            if (scanner.nextInt() % 2 == 0) {
                pars++;
                continue;
            }
            odds++;
        }

        System.out.println("Pairs: " + pars);
        System.out.println("Odds: " + odds);
    }
}
