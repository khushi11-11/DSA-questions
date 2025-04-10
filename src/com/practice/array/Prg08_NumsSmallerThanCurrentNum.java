package com.practice.array;

/*
8. How Many Numbers Are Smaller Than the Current Number
(https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)

Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.

Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation:
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1).
For nums[3]=2 there exist one smaller number than it (1).
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 */

import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Scanner;

public class Prg08_NumsSmallerThanCurrentNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int len = sc.nextInt();
        int[] input = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print(" element-" + i + " = ");
            input[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(input));
        result(input);
    }

    static void result(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) { // current number
            int c=0;
//            c initialized to 0 for every index val, but same for every comparison of an element
            for (int j = 0; j < nums.length; j++) { // numbers to compare
                if (nums[j]<nums[i]) c++;
            } res[i] = c;
        }
        System.out.println(Arrays.toString(res));
    }
}
