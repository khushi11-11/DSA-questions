package com.practice.array;

/*
9. Create Target Array in the Given Order
(https://leetcode.com/problems/create-target-array-in-the-given-order/)

-Given two arrays of integers nums and index. Your task is to create target array under the following rules:
-Initially target array is empty.
-From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
-Repeat the previous step until there are no elements to read in nums and index.
-Return the target array.

Example:-
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2,0,0]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Prg09_TargetArrayInOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        result(nums, index);
    }

    static void result(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) { // at i = 3, target={0,1,2,0,0}
            target.add(index[i], nums[i]);
        }
        System.out.println(target);

//        int[] arr = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            if(arr[index[i]] > 0) {
//                for (int j = nums.length; j < index[i]; j++) {
//                    arr[index[j]] = arr[index[j-1]];
//                }
//                arr[index[i]] = nums[i];
//            } else {
//                arr[index[i]] = nums[i];
//            }
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
