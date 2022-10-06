package edu.afpc.arrays;

import java.util.Arrays;

public class Invert {
    public static void main(String[] args) {
        int[] myArray = {0, 1, 2, 3, 4, 5};
        int[] reversedArray = new int[6];

        for (int i = 1; myArray.length >= i; i++) {
            reversedArray[(i - 1)] = myArray[myArray.length - i];
        }

        System.out.println(Arrays.toString(reversedArray));
    }
}
