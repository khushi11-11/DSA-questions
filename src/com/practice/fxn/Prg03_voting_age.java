package com.practice.fxn;

import java.util.Scanner;

public class Prg03_voting_age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        String res = eligible(age);
        System.out.println(res);
    }

    static String eligible(int age) {
        if ( age>=18 ) {
            return "You are eligible to vote.";
        } else {
            return "Sorry, you are not eligible to vote.";
        }
    }
}
