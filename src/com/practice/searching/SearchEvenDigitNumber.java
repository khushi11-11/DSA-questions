package com.practice.searching;

public class SearchEvenDigitNumber {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        int[] arr2 = {124, 18, 9, 1764, 98,1};
        System.out.println(search(arr));
        System.out.println(search(arr2));
    }

    static int search(int[] array) {
        int count=0; // counter for elements with even digits
        for(int num : array) {
            if(checkEven(num))
                count++;
        }
        return count;
    }
    static Boolean checkEven(int n) {
        /*
        number (n) ko 10 se divide krenge => n/10 [eg. 5678/10]
            this will give the quotient => 567
        loop me chlayenge jb tk n=0 ni hota => while(n!=0)
            aur har iteration me digit ko incr kr denge (initialized by zero) => digit++

        digit pe if condition use krenge => digit%2==0
         */
        int digit=0;
        while(n!=0) {
            n=n/10;
            digit++;
        }

        /*
        shortcut to find no. of digits of a number=>
        Math.log10(n)
         */
        return (digit % 2 == 0);
//        will return the result of the expr either True or False
    }
}
