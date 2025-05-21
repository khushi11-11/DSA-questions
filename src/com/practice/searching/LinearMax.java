package com.practice.searching;

import java.util.Arrays;

public class LinearMax {
    public static void main(String[] args) {
        int[] arr = {12,4,32,83,-9,90,18,-21,52,7,-1,11,4};
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum element= " + maximum(arr));
    }

    static int maximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
