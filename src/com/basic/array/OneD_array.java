package com.basic.array;

public class OneD_array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 23; // first element
        arr[1] = 90; // second element
//        arr[2] = 34; // third element

        System.out.println(arr[2]); // returns 0

        String[] fruits = new String[5];
        System.out.println(fruits[3]);
//        will return 'null' on output screen, null basically means it has no value
//        here, fruits[3] is an unset reference variable.
//        0 is a value but null does not have a value


    }
}

