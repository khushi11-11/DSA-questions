package com.basic.array;

import java.util.ArrayList;
import java.util.Scanner;


//  Multi-Dimensional ArrayList
public class MultiArrLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        array list of array lists of type integer
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();



//        initialization => here, actually we are creating new reference variables to point arraylist objects of the arraylist 'list'
        for (int i = 0; i < 3; i++) {
    //        in case of Arrays, for initialising or giving a length, we provided it in the declaration step ↑ only
    //        but here we will require a for loop
            list.add(new ArrayList<>()); // new empty arraylists at every index are initialized
    //            3 array lists will get added as elements of integer type to 'list'
        }



//        to add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
    //                get arraylist at ith index of arraylist - 'list', and add user input to it
            }
        }

//        print the arrayList
        System.out.println(list);
    }
}
