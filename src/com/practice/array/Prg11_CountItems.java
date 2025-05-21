package com.practice.array;

/*
11. Count Items Matching a Rule
(https://leetcode.com/problems/count-items-matching-a-rule/)

You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.

Example 1:
Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

 */

import java.util.Objects;
import java.util.Scanner;

public class Prg11_CountItems {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("How many items do you want in the list? ");
//        int n = sc.nextInt();
//        sc.nextLine(); //consume the leftover newline
//        String[][] items = new String[n][3];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter item type: "); // rule_key=type
//            items[i][0] = sc.nextLine();
//            System.out.print("Enter item color: "); // rule_key=color
//            items[i][1] = sc.nextLine();
//            System.out.print("Enter item brand: "); // rule_key=brand
//            items[i][2] = sc.nextLine();
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println("Item" + (i+1) + ": " +
//                    "type= " + items[i][0] +
//                    ", color= " + items[i][1] +
//                    ", brand= " + items[i][2] );
//        }
//        System.out.print("Rule key= ");
//        String ruleKey = sc.nextLine();
//        System.out.print("Rule value= ");
//        String ruleValue = sc.nextLine();
////        check(items, ruleKey, ruleValue);
////        rule-matching
//

        String[][] arr = {
                {"Phone", "Black", "Pixel"},
                {"Laptop", "Silver", "Dell"},
                {"Phone", "Silver", "Samsung"}
        };
        check(arr, "color", "silver");
    }

    static void check(String[][] array, String key, String value) {
        int m;
        if ( key.toLowerCase() == "type" ) {
            m = 0;
        } else if ( key.toLowerCase() == "color" ) {
            m = 1;
        } else {
            m = 2;
        }
        int  count = 0;
        for (String[] strings : array) {
            if (strings[m].equalsIgnoreCase(value)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
