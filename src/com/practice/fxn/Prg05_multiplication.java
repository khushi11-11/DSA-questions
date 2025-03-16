package com.practice.fxn;

import java.util.Scanner;

public class Prg05_multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = input.nextInt();
        System.out.print("Enter num2: ");
        int b = input.nextInt();

        System.out.println("Product = " + result(a,b));
    }

    static int result(int x, int y) {
        return x*y ;
    }
}
