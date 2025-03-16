package com.practice.fxn;

import java.util.Scanner;

public class Prg06_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int rad = sc.nextInt();
        System.out.println("Circumference= " + circumference(rad));
        System.out.println("Area= " + area(rad));
    }

    static float area(int r) {
        return (float) (3.14*r*r);
    }

    static float circumference(int r) {
        return (float) (2*3.14*r);
    }
}
