package com.NkProblemSolving.Strings.Day3.Day4;

import java.util.Scanner;

public class ToggleEachCharacterCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        toggleCharacterCase(str);
    }

    static void toggleCharacterCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                result += Character.toLowerCase(ch);
            }
            else {
                result += Character.toUpperCase(ch);
            }
        }
        System.out.println(result);
    }
}
