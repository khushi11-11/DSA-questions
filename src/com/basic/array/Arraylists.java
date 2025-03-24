package com.basic.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {
    public static void main(String[] args) {

        /*
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(23);
        list.add(79);
        list.add(31);
        list.add(29);
        list.add(83);
        list.add(55);
        System.out.println(list);

        list.set(3,45);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);
         */


        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(5);
//        for taking user input
        for (int i = 0; i < 5; i++) {
            arr.add(sc.nextInt());
        }
//        for item at specific index
        for (Integer integer : arr) {
            System.out.println(integer);
        }
//        OR
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr);
        }
//        in general
        System.out.println(arr);
    }
}
