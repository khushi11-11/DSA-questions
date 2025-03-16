package com.practice.fxn;

import java.util.Scanner;

public class Prg10_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        String res = result(number);
        System.out.println(res);
    }

    static String result (int num) {
//        palindrome mtlb reverse
//        divide by 10 kr k last number ko lena
//        mtlb rem variable me num%10
//        res me res*10 me rem add krna
//        naya number humara num/10 se nikalne wala quotient

        int temp=num; // 123
        int rem, res=0;
        while (temp!=0) {
            rem = temp%10; // 123%10 = 3
            res = (res*10)+rem; // 0*10 +3 = 0+3 = 3
            temp=temp/10; // 123/10 = 12
        }
        if ( res == num ) {
            return "Palindrome number.";
        } else {
            return "not a Palindrome number.";
        }
    }
}
