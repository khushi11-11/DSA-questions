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
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
 */

import java.util.Arrays;

public class Prg09_TargetArrayInOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        result(nums, index);
    }

    static void result(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < index.length; i++) { // i= 0 to 4
            if ( target[index[i]] == 0 ) { // if index is
                target[index[i]] = nums[i];
                // target[index[0]] = nums[0] -> target[0] = 0; by table

            } else {
                // target[0,1,2,3,4] != null
                int prev = nums[i];

                // we can have 2 references - current, previous
                // curr -> last-1 (bcoz there's always a place empty at the end when one element is still remaining to be put in the array) index (w/ decr) and prev -> previous to curr
                // put curr =to=> temp, prev=to=> curr, temp=to=> curr+1

                // curr (req index) ko daalo temp me
                // curr ko fill kro with nums[i]
                    // now comes a loop
                    // temp me stored h curr ki val
                    // next will point to index+1 of target
                    // 

            }
        }
        System.out.println(Arrays.toString(target));
    }
}
