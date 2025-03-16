package com.practice.fxn;

import java.util.Scanner;

public class Prg01_max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter num3: ");
        int num3 = sc.nextInt();
        int max_num = maxOf3(num1, num2, num3);
        int min_num = minOf3(num1, num2, num3);

        System.out.println("Maximum number: " + max_num);
        System.out.println("Minimum number: " + min_num);

    }

    static int maxOf3(int a, int b, int c) {
        if ( a>b ) {
            if ( a>c ) {
                return a;
            } else {
                return c;
            }
        } else {
            if ( b>c ) {
                return b;
            } else {
                return c;
            }
        }
    }

    static int minOf3(int a, int b, int c) {
        if ( a < b ) {
            if ( a < c ) {
                return a;
            } else {
                return c;
            }
        } else {
            if ( b < c ) {
                return b;
            } else {
                return c;
            }
        }
    }
}
