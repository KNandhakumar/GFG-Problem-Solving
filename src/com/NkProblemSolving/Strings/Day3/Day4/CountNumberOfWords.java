package com.NkProblemSolving.Strings.Day3.Day4;

import java.util.Arrays;

public class CountNumberOfWords {
    public static void main(String[] args) {
        String name = "I am learning DSA";
        // simple solution using split method
//        String[] words = name.trim().split(" ");
//        System.out.println(words.length);

        int ans = countNumbers(name);
        System.out.println(ans);
    }

    static int countNumbers(String name) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' '){
                if (!inWord){
                    count++;
                    inWord = true;
                }
            }
            else {
                inWord = false;
            }
        }
        return count;
    }
}
