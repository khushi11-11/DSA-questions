package com.practice.searching;

import java.util.Arrays;

public class LinearSearchOnString {
    public static void main(String[] args) {
        String var = "Khushi Verma";
        char target = 'h';
        System.out.println("String = " + var);
        System.out.println("String to array => " + Arrays.toString(var.toCharArray()));
        System.out.println("To search for = " + target);
        System.out.println(stringSearch(var, target));
    }
    static Boolean stringSearch( String s, char c ){
        if ( s.length() == 0) {
            return false;
        }
        for (int ch = 0; ch < s.length(); ch++) {
            if (s.charAt(ch) == c) return true;
        }
//        OR use foreach loop
//        for ( char ch : s.toCharArray()) {
//            if (ch == c) return true;
//        }
        return false;
    }
}
