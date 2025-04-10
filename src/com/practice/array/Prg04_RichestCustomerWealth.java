package com.practice.array;

/*
4. Richest Customer Wealth
(https://leetcode.com/problems/richest-customer-wealth/)

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6
 */


import java.util.Arrays;

public class Prg04_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = { {1,2,3}, {3,4,5}, {12,6,1} };
        for ( int[] i : accounts)
            System.out.println(Arrays.toString(i));

        maximumWealth(accounts);
    }

    static void maximumWealth(int[][] nums) {
        int[] sum = new int[nums.length];
//        array generated with elements as sum of all the a/c (elements) of array passes (nums)
        for (int ac = 0; ac < nums.length; ac++) {
            for (int i = 0; i < nums[ac].length; i++) {
                sum[ac] += nums[ac][i];
            }
        }

        int max = 0, index=0;
//        comparison of all the elements of sum[] array to find the richest a/c
        for (int k = 0; k < sum.length; k++) {
            if (max < sum[k]) {
                max = sum[k];
                index = k+1;
            }
        }
        System.out.println("Richest customer account no.: " + index);
        System.out.println("Wealth: " + max);
    }
}
