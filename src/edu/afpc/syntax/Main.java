package edu.afpc.syntax;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String firstName = "Anderson";
        String lastName = "Correa";
        String fullName = fullname(firstName, lastName);
        System.out.println(fullName);
    }

    public static String fullname(String firstname, String lastName) {
        return firstname + " " + lastName;
    }


}