package edu.afpc.syntax;

import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.Scanner;

public class Terminal {
    public static void main(String @NotNull [] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Write your name to the terminal");
        String name = scanner.next();
        System.out.println("Write your last name");
        String lastName = scanner.next();
        System.out.println("Write your age");
        int age = scanner.nextInt();
        System.out.println("Write your height");
        double height = scanner.nextDouble();

        System.out.println("Name: " + name + " " + lastName);
        System.out.println("You are " + age + " years old and your height is " + height);
    }
}
