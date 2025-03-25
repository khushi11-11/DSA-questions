package com.basic.array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=(42);
        arr[1]=(56);
        arr[2]=(3);
        arr[3]=(89);
        arr[4]=(17);
        System.out.println(Arrays.toString(arr));
        swapping(arr, 4, 1);
        System.out.println("After swapping~");
        System.out.println(Arrays.toString(arr));
    }

    static void swapping (int[] array, int index1, int index2) {
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
