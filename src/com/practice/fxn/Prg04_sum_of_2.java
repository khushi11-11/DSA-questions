package com.practice.fxn;

import java.util.Scanner;

public class Prg04_sum_of_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = input.nextInt();
        System.out.print("Enter num2: ");
        int b = input.nextInt();

        System.out.println("Sum = " + result(a,b));
    }

    static int result(int x, int y) {
        return x+y ;
    }
}
