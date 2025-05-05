package com.NkProblemSolving.Strings.Day3.Day4;

import java.util.Arrays;
import java.util.HashMap;

public class CheckAnagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (checkAnagram(str1,str2)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
    static boolean checkAnagram(String str1,String str2){
        // step 1 : check length
        if (str1.length()!=str2.length()){
            return false;
        }
        // step 2 : convert to character array and sort
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // compare sorted arrays
        return Arrays.equals(ch1,ch2);
    }
}
