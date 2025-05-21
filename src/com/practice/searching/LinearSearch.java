package com.practice.searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
//        int[] arr = {12,4,32,83,-9,90,18,-21,52,7,-1,11,4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter array elements-> ");
        for (int i = 0; i < len; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the num to find: ");
        int target = sc.nextInt();
        System.out.println(linear(arr, target));
    }

    static int linear(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
//            return arr[i]; returns element
//            return true; for Boolean type function
        }
        return -1;
//   return Integer.MAX_VALUE; used when element is returned; bcz -1 that we're returning can also be array element
//    return false;
    }
}
