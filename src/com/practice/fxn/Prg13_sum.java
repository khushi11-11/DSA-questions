package com.practice.fxn;

import java.util.Scanner;

// Write a function that returns the sum of first n natural numbers.

public class Prg13_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number:- ");
        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " natural numbers is " + sum(n));
    }

    public static int sum (int num) {
        int sum = 0;
         if (num >= 1){
             for ( int i=1; i<=num; i++){
                 sum+=i;
             }
         } else {
             System.out.println("Entered number is not a natural number.");
         }
         return sum;
    }
}
