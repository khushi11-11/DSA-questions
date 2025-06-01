package com.practice.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnostic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int len = sc.nextInt();

        int[] array = new int[len];
        System.out.println("Enter array elements (either ascending or descending) : ");
        for (int i = 0; i < len; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(array));

        System.out.print("To search? ");
        int target = sc.nextInt();

        System.out.println(search(array, len, target));
    }

    static boolean search(int[] arr, int len, int num) {
        if (arr[0] > arr[len-1])
            return descSearch(arr, num);
        else
            return ascSearch(arr, num);

    }

    static boolean ascSearch(int[] arr, int num) {
        int start = 0, end = arr.length-1;
        int mid;
        while( start <= end ) {
            mid = start + (end-start)/2;
            if ( arr[mid] < num ) {
                start = mid+1;
            } else if ( arr[mid] > num ) {
                end = mid-1;
            } else {
                return true;
            }
        }
        return false;
    }

    static boolean descSearch(int[] arr, int num) {
        int start = 0, end = arr.length-1;
        int mid;
        while( start <= end ) {
            mid = start + (end-start)/2;
            if ( arr[mid] <= num ) {
                end = mid-1;
            } else if ( arr[mid] > num ) {
                start = mid+1;
            } else {
                return true;
            }
        }
        return false;
    }
}
