package edu.afpc.methods;

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        String choice = init();
        System.out.println("The area is: " + getArea(choice));
    }
    static Scanner scanner = new Scanner(System.in);

    public static String init() {
        System.out.println("Choose a geometric shape from the list.");
        System.out.println("Choose based on the items index (a, b or c)");
        System.out.println("a. Square");
        System.out.println("b. Rectangle");
        System.out.println("c. Trapezium");
        String shape = scanner.next();
        if (!shape.equals("a") && !shape.equals("b") && !shape.equals("c")) {
            System.out.println("Please write a valid choice (a, b or c)");
            init();
        }
        return shape.equals("c") ? "Trapezium" : "Quadrilateral";
    }

    public static double getArea(String shape) {
        System.out.println("You chose to calculate the area of a " + shape);
        double[] sides = new double[3];
        if (shape.equals("Trapezium")) {
            System.out.println("Write the bigger base side:");
            sides[0] = scanner.nextInt();
            System.out.println("Write the smaller base side:");
            sides[1] = scanner.nextInt();
        } else {
            System.out.println("Write the side:");
            sides[1] = scanner.nextInt();
        }
        System.out.println("Write the height side:");
        sides[2] = scanner.nextInt();

        return calculateArea(shape, sides);
    }

    public static double calculateArea(String shape, double[] sides) {
        if (shape.equals("Trapezium")) {
            return ((sides[0] + sides[1]) * sides[2]) / 2;
        }
        else return sides[1] * sides[2];
    }
}
