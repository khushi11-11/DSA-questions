package com.practice.array;

/*
6. Kids With the Greatest Number of Candies
(https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prg06_KidsWithMaxCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(Arrays.toString(candies));
        result(candies, extraCandies);
        alternate(candies, extraCandies);
    }

    static void result(int[] arr, int extras) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if( max < arr[i] ) max=arr[i];
        }

        Boolean[] res = new Boolean[arr.length];
        for (int i = 0; i < res.length; i++) {
            if ( (arr[i]+extras >= max)) {
                res[i] = true;
            } else {
                res[i] = false;
            }
        }
        System.out.println(Arrays.toString(res));
    }

//    static List<Boolean> alternate(int[] candies, int extraCandiess) {
//        int max = candies[0];
//        for (int x : candies) {
//            max = Math.max(max,x); // checks/compares for every element x in candies
//        }
//        ArrayList<Boolean> res = new ArrayList<>();
//        for (int x : candies) {
//            res.add( (x+extraCandiess)>=max);
//        }
//        return res;
//    }
}
