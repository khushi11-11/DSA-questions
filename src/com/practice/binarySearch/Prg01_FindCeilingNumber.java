package com.practice.binarySearch;

/*
step-01 : get all elements >= target
step-02 : find the smallest of them

** can apply order agnostic for step 2

 */

public class Prg01_FindCeilingNumber {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 9, 14, 16, 20, 25};
        int[] array2 = {29, 22, 19, 17, 14, 10, 8, 6, 3, 1};
        int target = 13;
//    output should be 14

        int ans = ceiling(array2, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int num) {
        int start = 0, end = arr.length-1;
        
        if ( arr[0] < arr[arr.length-1] ) {
        // ascending order
            int mid;
            while (start <= end ) {
                mid = start + (end-start)/2;
                if ( arr[mid] > num ) {
                    end = mid-1;
                } else if (arr[mid] < num) {
                    start = mid+1;
                } else {
                    return arr[mid];
                }
            }
//            when start > end (explanation in text file - CeilingNumber.txt)
            return arr[start];


        } else {
        // descending order
            int mid;
            while (start <= end ) {
                mid = start + (end-start)/2;
                if ( arr[mid] < num ) {
                    end = mid-1;
                } else if (arr[mid] > num) {
                    start = mid+1;
                } else {
                    return arr[mid];
                }
            }
//            when start > end so the element which is ceiling has to be the previous one => end
            return arr[end];
        }
//        return -1;
    }
}
