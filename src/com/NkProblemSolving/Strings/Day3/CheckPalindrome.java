package com.NkProblemSolving.Strings.Day3;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        checkPalindrome(name);
    }

    static void checkPalindrome(String name) {
        String reverse = "";
        for (int i = name.length()-1; i >= 0 ; i--) {
            reverse += name.charAt(i);
        }
        if (reverse.equals(name)){
            System.out.println("Yes " + name + " is Palindrome");
        }
        else {
            System.out.println("No " + name + " is Not Palindrome");
        }
    }
}
