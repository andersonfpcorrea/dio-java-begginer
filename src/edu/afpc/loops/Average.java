package edu.afpc.loops;

import java.util.*;

public class Average {
    public static void main(String[] args) {
        storeValues();
        System.out.println("The values are: " + Arrays.toString(values));
        System.out.println("The maximum value is: " + maxValue());
        System.out.println("The minimum value is: " + minValue());
        System.out.println("The average value is: " + averageValue());

    }
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    static int[] values = new int[5];

    public static void storeValues() {
        System.out.println("Write the first number:");
        values[0] = scanner.nextInt();
        System.out.println("Write the second number:");
        values[1] = scanner.nextInt();
        System.out.println("Write the third number:");
        values[2] = scanner.nextInt();
        System.out.println("Write the forth number:");
        values[3] = scanner.nextInt();
        System.out.println("Write the fith number:");
        values[4] = scanner.nextInt();
    }

    public static OptionalInt maxValue() {
        return Arrays.stream(values).max();
    }

    public static OptionalInt minValue() {
        return Arrays.stream(values).min();
    }

    public static OptionalDouble averageValue() {
        return Arrays.stream(values).average();
    }
}
