package com.practice.fxn;

import java.util.Scanner;

public class Prg12_prime_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prime Numbers Between 2 Given Integers~");
        System.out.print("Enter lower bound: ");
        int lb = sc.nextInt();
        System.out.print("Enter upper bound: ");
        int ub = sc.nextInt();

        System.out.println("Prime Numbers :- " + generate(lb, ub));
    }

    static String generate(int lower, int upper) {
        String prime = "";
        for (int i = lower; i <= upper; i++) { // 'i' is the range of numbers to check for prime and display
            int count = 0;
            for (int j = 1; j <= i; j++) { // j is the range of divisors for current value of i
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                prime = prime + (i+" ");
            }
        }
        return prime;
    }
}
