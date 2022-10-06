package edu.afpc.methods;

import java.util.Date;
import java.util.Scanner;

/**
 * Goal: to create an app that gives the user the ability between three "sub-apps":
 * <ul>
 *     <li>Basic Calculator</li>
 *     <li>Salute</li>
 *     <li>Loan Calculator</li>
 */
public class Apps {
    public static void main(String[] args) {
        String choice = chooseApp();
        switch (choice) {
            case ("a"):
                calculator();
                break;
            case ("b"):
                salute();
                break;
            case ("c"):
                calcLoan();
                break;
            default:
                System.out.println("Good bye!");
        }


    }
    static Scanner scanner = new Scanner(System.in);

    public static String chooseApp() {
        System.out.println("Choose the app you want to use:");
        System.out.println("a. Calculator");
        System.out.println("b. Salutation");
        System.out.println("c. Loan calculator");
        String c = scanner.next().toLowerCase();
        if (!c.equals("a") && !c.equals("b") && !c.equals("c")) {
            System.out.println("Write only a letter (a, b or c) and press Enter");
            chooseApp();
        }
        return c;
    }

    public static void calculator() {
        System.out.println("First number: ");
        double a = scanner.nextInt();
        System.out.println("Second number: ");
        double b = scanner.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    public static void salute() {
        int hour = new Date().getHours();
        int min = new Date().getMinutes();
        System.out.println("Good " + (hour < 12 ? "morning" : "afternoon") +"! It is " + hour + " hours and " + min + " minutes");
    }

    public static void calcLoan() {
        System.out.println("===========================================");
        System.out.println("Choose a value for the loan (integer number):");
        String v = scanner.next();
        int value = 0;
        try {
         value = Integer.parseInt(v, 10);
        } catch (NumberFormatException e) {
            System.out.println("Invalid value! Write an integer number");
            calcLoan();
        }
        System.out.println("===========================================");
        System.out.println("How many installments? (write an integer number)");
        String i = scanner.next();
        int installments= 1;
        try {
            installments = Integer.parseInt(i, 10);
        } catch (NumberFormatException e) {
            System.out.println("Invalid value! Write an integer number");
            calcLoan();
        }
        double total = (((0.3 * installments) / 12) * value) + value;
        double eachInstallment = total / installments;
        System.out.println("Given the interest rate of 30%/year, each installment is: " + eachInstallment);
        System.out.println("The total total amount to be paid is: " + total);
    }
}
