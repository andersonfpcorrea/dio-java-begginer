package edu.afpc.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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
        System.out.println("The lowest grade: " + Collections.max(grades));
        double counter = 0;
        for (Double val :grades) {
            counter += val;
        }
        System.out.println(counter/grades.size());
        Iterator<Double> iterator = grades.iterator();
        double sum = 0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            sum += next;
        }
        System.out.println(sum);
        System.out.println(grades);
        grades.remove(7d);
        grades.add(10d);
        grades.add(12d);
        grades.add(4d);
        grades.add(7d);
        System.out.println(grades);
//        grades.removeIf(val -> val < 7);
//        System.out.println(grades);
//        grades.clear();
//        System.out.println(grades);
//        System.out.println(grades.isEmpty());
        ArrayList<Double> newGrades = new ArrayList<>(grades);
        System.out.println(newGrades.get(0));
        System.out.println(newGrades.remove(0));









    }
}
