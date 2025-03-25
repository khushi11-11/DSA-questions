package com.basic.array;

import java.util.Arrays;

public class MaxInRange {
    public static void main(String[] args) {
        int[] arr = {34, 323, 7, 143, 468, 98, 2};
        System.out.println(Arrays.toString(arr));
        System.out.println(maximum(arr, 1, 5));
    }
    static int maximum(int[] a, int i1, int i2) {
        int max = a[i1];
        for (int i = i1+1; i < i2; i++) {
            if ( max < a[i] ) {
                max = a[i];
            }
        }
        System.out.print("Maximum element in range (" + i1 + ", " + i2 + "): ");
        return max;
    }

//    if (end > start) {
//        return -1;
//    }
//    if (array.length==0) {
//        return -1;
//    }
//    if (array==null) {
//        return -1;
//    }


}
