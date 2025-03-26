package com.practice.array;

/*
3. Running Sum of 1d Array
(https://leetcode.com/problems/running-sum-of-1d-array/)

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */

import java.util.Arrays;

public class Prg03_RunningSum {
    public static void main(String[] args) {
        int[] nums = { 12, 12, 12, 12, 12, 12 };
        System.out.println(Arrays.toString(nums));
        running(nums);
    }

    static void running(int[] arr) {
        int[] res = new int[arr.length];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            res[i] = sum;
        }
        System.out.println(Arrays.toString(res));
    }
}
