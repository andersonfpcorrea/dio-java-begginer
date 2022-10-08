package edu.afpc.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(7d);
        System.out.println(grades);
        System.out.println(grades.indexOf(7d));


        grades.add(2.0);
        grades.add(2.0);
        grades.add(2.0);
        grades.add(2.0);
        grades.add(2.0);
        grades.add(2.0);
        System.out.println(grades);
        grades.add(5, 5d);
        System.out.println(grades);
        grades.set(grades.indexOf(5d), 6d);
        System.out.println(grades);
        System.out.println(grades.contains(10d));
        System.out.println(grades.get(1)); // 2.0
        System.out.println("The lowest grade: " + Collections.min(grades));


    }
}
