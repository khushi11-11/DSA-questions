package com.practice.binarySearch;
/*
largest number out of all the numbers smaller than the target

firstly, we try to find and match mid of the array with the target
if start=end & mid != target,
    then find the previous one (for asc order), next one (for desc order)
 */


public class Prg02_FloorNumber {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,9,12,14,16,20};
        int[] arr2 = {29, 22, 19, 17, 14, 10, 8, 6, 3, 1};
        int target = 27;
//        result => 22
        System.out.println(floorNum(arr2, target));
    }

    static int floorNum(int[] array, int num) {
        int start=0, end= array.length-1; // pointers
        int mid;

        if (array[start] < array[end]) {
            while (start <= end) {
                mid = start + (end-start)/2;
                if (array[mid] < num)
                    start = mid+1;
                else if (array[mid] > num)
                    end = mid-1;
                else // when start=end
                    return array[mid];
            } // when start > end
            return array[end];
        }
        else { // desc
            while (start <= end) {
                mid = start + (end-start)/2;
                if (array[mid] > num) {
                    start = mid+1;
                } else if (array[mid] < num) {
                    end = mid-1;
                } else {
                    return array[mid];
                }
            }
            return array[start];
        }

    }
}
