package com.NkProblemSolving.Strings.Day3;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String reverse = "";
        for (int i = name.length()-1; i >= 0 ; i--) {
            reverse += name.charAt(i);
        }
        System.out.println(reverse);
    }
}
