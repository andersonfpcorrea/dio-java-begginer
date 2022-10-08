package edu.afpc.interfaces;

public class Calculator implements Interfaces{
    public void sum (double a, double b) {
        System.out.println(a + b);
    }
    public void subtract (double a, double b) {
        System.out.println(a -b);
    }
    public void divide (double a, double b) {
        System.out.println(a / b);
    }
    public void multiply (double a, double b) {
        System.out.println(a * b);
    }
}
