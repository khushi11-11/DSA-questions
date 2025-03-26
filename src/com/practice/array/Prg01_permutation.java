package com.practice.array;
/* 1. Build Array from Permutation
 (https://leetcode.com/problems/build-array-from-permutation/)

Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans[] is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]
 */

import java.util.Arrays;

public class Prg01_permutation {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 0, 3, 5 };
        System.out.println(Arrays.toString(arr));
        result(arr);

    }

    static void result (int[] a) {
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[a[i]];
        }
        System.out.println(Arrays.toString(res));
    }
}
