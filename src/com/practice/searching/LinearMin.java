package com.practice.searching;

import java.util.Arrays;

public class LinearMin {
    public static void main(String[] args) {
        int[] arr = {12,4,32,83,-9,90,18,-21,52,7,-1,11,4};
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum element= " + minimum(arr));
    }

    static int minimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
