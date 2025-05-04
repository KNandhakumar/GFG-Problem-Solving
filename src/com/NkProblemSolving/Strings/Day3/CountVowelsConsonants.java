package com.NkProblemSolving.Strings.Day3;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        countVowelsConsonants(name);
    }

    static void countVowelsConsonants(String name) {
        int vowelCount = 0;
        int consonantCount = 0;
        name = name.toLowerCase(); // handle capital letters
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowelCount++;
                }
                else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowels = " + vowelCount + " , Consonants = " + consonantCount);
    }
}
