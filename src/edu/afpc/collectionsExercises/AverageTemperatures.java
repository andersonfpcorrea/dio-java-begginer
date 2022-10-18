package edu.afpc.collectionsExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageTemperatures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> temperatures = new ArrayList<Double>(){{
            add(28.0);
            add(32.0);
            add(33.0);
            add(35.0);
            add(27.7);
            add(25.0);
        }};
        double sum = 0;
        for (int i = 0; i < temperatures.size(); i++) {
            sum += temperatures.get(i);
        }
        double avg = sum / temperatures.size();
        System.out.println(avg);
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};

        for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) > avg) {
                System.out.println("Above avarage temperature in " + temperatures.indexOf(temperatures.get(i + 1)) + " - " + months[i]);
            }
        }





    }
}
