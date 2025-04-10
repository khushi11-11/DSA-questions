package com.practice.array;

/*
5. Shuffle the Array
(https://leetcode.com/problems/shuffle-the-array/)
Q. Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
 */


import java.util.Arrays;

public class Prg05_ArrayShuffle {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4, 7 };
        System.out.println(Arrays.toString(arr));
        shuffle(arr);
    }

    static void shuffle(int[] nums) {
        int mid = (nums.length/2); // 6/2 = 3
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i%2==0) {
                res[i] = nums[i/2]; // res[0,2,4,6,..] = nums[0,1,2,3,...,mid-1]
                // res[0] = nums[0/2=0]
                // res[2] = nums[2/2=1]
                // res[4] = nums[4/2=2]
            } else {
                res[i] = nums[mid];// res[1,3,5,...] = nums[mid, mid+1, ...]
                mid++;
                // res[1] = nums[3]
                // res[3] = nums[4]
                // res[5] = nums[5]
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
