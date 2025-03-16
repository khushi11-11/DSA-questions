package com.practice.fxn;

import java.util.Scanner;

public class Prg08_grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks (out of 100): ");
        int marks = sc.nextInt();
        System.out.println(result(marks));
    }

    static String result(int marks) {
            if ( marks>90 ) {
                return "Grade= AA";
            } else if (marks>80 && marks<91) {
                return "Grade= AB";
            } else if (marks>70 && marks<81) {
                return "Grade= BB";
            } else if (marks>60 && marks<71) {
                return "Grade= BC";
            } else if (marks>50 && marks<61) {
                return "Grade= CD";
            } else if (marks>40 && marks<51) {
                return "Grade= DD";
            } else if (marks<40 && marks>=0) {
                return "Grade= Fail";
            } else {
                return "ERROR! Enter marks between 0 and 100.";
            }
    }
}
