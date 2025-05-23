package com.basic.array;

import java.util.Arrays;

public class MaxElements {
    public static void main(String[] args) {
        int[] arr = { 232, 52, 919, 45, 11, 89 };
        System.out.println(Arrays.toString(arr));
        System.out.println(maximum(arr));
    }

    static int maximum(int[] array) {
        int max = array[0];
//        OR int max = Integer.MIN_VALUE; the min value an integer type variable can hold
        for (int i = 1; i < array.length; i++) {
            if ( max < array[i] ) {
                max = array[i];
            }
        }
        return max;
    }
}
