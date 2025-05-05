package com.NkProblemSolving.Strings.Day3.Day4;

public class RemoveAllVowels {
    public static void main(String[] args) {
        String str = "hello world";
        removeVowels(str);
    }

    static void removeVowels(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
                if (!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')){
                    result += ch;
            }
        }
        System.out.println(result);
    }
}
