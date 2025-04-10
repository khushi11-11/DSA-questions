package com.practice.array;

/*
7. Number of Good Pairs
(https://leetcode.com/problems/number-of-good-pairs/)

Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

 */


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Prg07_NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int len = sc.nextInt();
        int[] input = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print(i + " element= ");
            input[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(input));
        System.out.println(goodPair(input));
    }

    static int goodPair(int[] num) {
//        we just need to tell how many good pairs are there in total in the provided array
        int c=0;
        for (int i = 0; i < num.length; i++) { // if i=2, then j=3,4,5,...n-1
            for (int j = i+1; j < num.length; j++) {
                if (num[i] == num[j]) c++;
            }
        }
        return c;
    }
}
