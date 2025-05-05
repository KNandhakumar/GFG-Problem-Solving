package com.NkProblemSolving.Strings.Day3.Day4;

public class CheckOnlyDigits {
    public static void main(String[] args) {
        String str = "12345";
        checkOnlyDigits(str);
    }

    static void checkOnlyDigits(String str) {
        boolean isOnlyDigit = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))){
                isOnlyDigit = false;
                break;
            }
        }
        if (isOnlyDigit){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
