package com.practice.fxn;

import java.util.Scanner;

public class Prg02_even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = input.nextInt();
        String res = find(num);
        System.out.println(res);
    }

    static String find(int number) {
        if ( number%2 == 0 ) {
            return "Even number.";
        } else {
            return "Odd number.";
        }
    }
}
