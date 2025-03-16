package com.practice.fxn;

import java.util.Scanner;

public class Prg11_triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        System.out.print("Enter num2: ");
        int b = sc.nextInt();
        System.out.print("Enter num3: ");
        int c = sc.nextInt();

        System.out.println(check(a,b,c));
    }

    static String check(int num1, int num2, int num3) {
        int x = num1*num1;
        int y = num2*num2;
        int z = num3*num3;

        if ( (x==y+z) || (y==x+z) || (z==x+y) ) {
            return "Given is a Pythagorean triplet.";
        } else {
            return "Given is not a Pythagorean triplet.";
        }
    }

}
