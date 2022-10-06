package edu.afpc.arrays;

import java.util.Arrays;
import java.util.Random;

public class Multidimensional {
    public static void main(String[] args) {
        Random random  = new Random();
        int[][] matrix = new int[4][4];

        for (int line = 0; line < 4; line++) {
            for (int column = 0; column < 4; column++) {
                matrix[line][column] = random.nextInt(10);
            }
        }

        System.out.println("This is the multidimensional array:");
        for(int[] array : matrix) {
            System.out.println(Arrays.toString(array));
        }
    }
}
