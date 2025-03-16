package com.practice.fxn;

import java.util.Scanner;

public class Prg09_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int a = sc.nextInt();
        System.out.println("Factorial of " + a + " is " + fact(a));
    }

    static int fact(int num) {
        int fact=1;
        for (int i=num; i>=1; i--) {
            fact=fact*i;
        }
        return fact;
    }
}
