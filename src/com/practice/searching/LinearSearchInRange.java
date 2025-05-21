package com.practice.searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr = {12,4,32,83,-9,90,18,-21,52,7,-1,11,4};
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower bound: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper bound: ");
        int upper = sc.nextInt();
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        Boolean ans = searchInRange(arr, lower, upper, target);
        System.out.println(ans);
    }

    static Boolean searchInRange(int[] array, int lb, int ub, int target) {
        for (int i = lb; i < ub; i++) {
            if (array[i] == target) return true;
        }
        return false;
    }
}
