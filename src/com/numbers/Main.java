/*
 * Java program to find numbers dividable by 3
 */

package com.numbers;

import java.util.Random;

/*
 * com.numbers.Main class
 */
public class Main {

    // com.numbers.Main method to run java program
    public static void main(String[] args) {

        // Creating an array of random 12 numbers
        int arr [] = new int[12];

        // Filling the array with numbers
        for (int index = 0; index < arr.length; index++) {

            arr[index] = new Random().nextInt();
        }

        // Printing number to console and result of dividing by 3
        for (int index = 0; index < arr.length; index++) {

            // Condition
            if (arr[index] % 3 == 0) {

                System.out.println(arr[index] + " is dividable by 3.");

            } else {

                System.out.println(arr[index] + " is not dividable by 3.");

            }
        }
    }
}