package com.practice.array;

/*
2. Concatenation of Array
https://leetcode.com/problems/concatenation-of-array/

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]

 */

import java.util.Arrays;

public class Prg02_Concatenation {
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 2, 8, 0, 3, 5};

        System.out.println(Arrays.toString(arr));
        System.out.println("after concatenation, ");
        concat(arr);

    }
    static void concat(int[] a) {
        int len = a.length;
        int[] res = new int[2*len];

        for (int i = 0; i < 2*len; i++) {
            if (i<len) {
                res[i] = a[i];
            } else {
                res[i] = a[i-len];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
