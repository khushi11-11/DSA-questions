package com.basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len;
        System.out.print("Enter the length of array: ");
        len = sc.nextInt();

        String[] fruits = new String[len];
        for (int i = 1; i <= len; i++) {
            System.out.print("Enter fruit " + (i) + ": ");
            fruits[i-1] = sc.next();
        }

//        modifying 3rd element, index=2
        fruits[2] = "khushi";

//        enhanced for loop (for-each), where 'iterator' traverses through the array 'fruits'
        for (String iterator : fruits) {
            System.out.println(iterator);
        }

//        displays the array elements inside sq. brackets separated with comma
        System.out.println(Arrays.toString(fruits));
    }
}
