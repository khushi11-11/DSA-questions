package com.practice.array;

/*
10. Check if the Sentence Is Pangram
(https://leetcode.com/problems/check-if-the-sentence-is-pangram/)

- A pangram is a sentence where every letter of the English alphabet appears at least once.

Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
 */


import java.util.Scanner;

public class Prg10_PangramSentence {
    public static void main(String[] args) {
        String sent = "thequickbrownfoxjumpsoverthelazydog";
        String case3 = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a stream of characters (without any spaces): ");
        String s = sc.nextLine();
        System.out.println(checkForPanagram(s));
    }

    static boolean checkForPanagram(String sent) {
        if ( sent.length() < 26 ) return false;
//        agar length hi 26 se low h, that means sabhi alphabets included ni h OR har alphabet ki occur ni hora
        else {
            for (char ch = 'a'; ch < 'z'; ch++) {
//                traverses from a to z
                if ( sent.indexOf(ch) <0 ) return false;
//                agar sent me kisi bhi alphabet (a-z) ka index 0 se low h mtlb vo present ni h
            }
            return true;
//            har alphabet ka koi index value h sent me -> every alphabet occurs at least once
        }

//        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//        char[] chars = sent.toCharArray();
//        int count = 0;
//        for (int i = 0; i < alphabets.length; i++) {
//            for (int j = 0; j < chars.length; j++) {
//                if ( alphabets[i] == chars[j] ) {
//                    count++;
//                    break;
//                }
//            }
//        }
//        if ( count >= 26 ) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
