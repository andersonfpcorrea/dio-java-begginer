package edu.afpc.loops;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double average = 0;
        int counter = 0;

        while(counter < 5) {
            System.out.println("Write a number higher than 0:");
            max = Math.max(scanner.nextDouble(), max);
            average = max / (counter + 1);
            counter++;
        }
        System.out.println("The higher number was: " + max);
        System.out.println("The average was: " + average);



    }
}
