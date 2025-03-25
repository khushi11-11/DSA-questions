package com.basic.array;


// updating an element => arr[index] = newValue;
//updating through fxn

import java.util.Arrays;
import java.util.Scanner;

public class PassingInFxn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("number" + (i+1) + " : ");
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nums));

        update(nums); // mutable behavior of arrays
        System.out.println(Arrays.toString(nums));
    }

    static void update(int[] arr) {
        arr[2] = 34;
    }
}
