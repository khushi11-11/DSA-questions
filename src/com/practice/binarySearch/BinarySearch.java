package com.practice.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {9, 20, 31, 37, 46, 50, 58, 70, 89, 91};
        int target = 50;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        /*
        int mid = (start+end)/2; (case for large size array)
            > int has a fixed size
            > there might be a possibility that, start+end may exceed the range of int
            > returns an error
         */

        while(start <= end) {
            int mid = start + (end-start)/2;
            if ( arr[mid] == target )
                return mid;
            else {
                if( arr[mid] > target )
                    end = mid-1;
                else
                    start = mid+1;
            }
        }
        return -1;
    }
}
