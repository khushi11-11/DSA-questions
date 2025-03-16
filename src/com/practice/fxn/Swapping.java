package com.practice.fxn;

import static java.util.Collections.swap;

public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("before swapping :- ");
        System.out.println("a= " + a + ", b= " + b);

        swap(a,b);
        System.out.println("after swapping, a= " + a + ", b= " + b);
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

//        OR:-
//        a = a+b; b = a-b; a = a-b;

        System.out.println("after swapping inside swap fxn :- ");
        System.out.println("a= " + num1 + ", b= " + num2);
    }
}
