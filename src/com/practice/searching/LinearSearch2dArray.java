package com.practice.searching;

import java.util.Arrays;

public class LinearSearch2dArray {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3}, {4,5,6,7}, {8,9} };
        int target = 17;
//        return an array consisting of the row and column where target exists
        int[] ans = searching(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searching(int[][] array, int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == number) {
                    return  new int[]{i, j};
//                    writing new int[] create a new 1D array with i and j as its value
                }
            }
        }
        return new int[]{-1,-1};
//        if it does not find the stmt17 as the return smt
//        this indicates no such element found
    }
}
