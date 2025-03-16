package com.practice.fxn;

public class Call_by_value {
    public static void main(String[] args) {
        String naam = "Khushi";
        greet(naam);
        greet("manya");

//        String personalized = myGreet();
//        option+enter will let you create method (myGreet)
    }

//    private static String myGreet() {
//    }

    static void greet(String name){
        System.out.println("Hello, " + name);
    }
}
