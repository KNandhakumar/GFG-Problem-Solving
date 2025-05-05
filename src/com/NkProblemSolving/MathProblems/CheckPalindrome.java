package com.NkProblemSolving.MathProblems;

public class CheckPalindrome {
    public static void main(String[] args) {
        int n = 121;
        checkPalindrome(n);
    }

    static void checkPalindrome(int n) {
        int originalNum = n;
        int reverse = 0;
        while (n>0){
            int remainder = n%10;
            reverse = reverse*10+remainder;
            n = n/10;
        }
        if (originalNum == reverse){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
