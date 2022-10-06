package edu.afpc.arrays;

import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.print("These are the numbers:");
        for (int number : numbers) {
            System.out.print(" " + number);
        }
        System.out.print("\nThese are the their successors:");
        for (int number : numbers) {
            System.out.print(" " + (number + 1));
        }

    }
}
