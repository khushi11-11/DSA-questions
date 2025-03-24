package com.basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

//        int[][] arr = new int[4][];
//        dynamic array, where colum length is not specified

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

//        output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

//        System.out.print("[ ");
        for (int row = 0; row < arr.length; row++) {
//            System.out.print("[ ");
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + ", ");
            }
//            System.out.println("]");
        }
//        System.out.print(" ]");


        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
//        System.out.println(Arrays.toString(arr));

        for ( int[] i : arr) System.out.println(Arrays.toString(i));
//        why 'i' ? bcoz i is the iterator that traverses every element (row) of the array.
//        so whenever using enhanced-for loop, we print the elements and not the array
    }
}
