package com.practice.fxn;

import java.util.Scanner;

public class Prg07_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int x = sc.nextInt();
        System.out.println(result(x));
    }

    static String result(int num) {
        int counter = 0;
        for (int i=1; i<=num; i++) {
            if ( num%i == 0 ) {
                System.out.print(i + ", ");
                counter++;
            }
        }
        if ( counter==2 ) {
            return ("Hence " + num + " is a prime number.");
        } else {
            return ("Hence " + num + " is a composite number.");
        }
    }
}
