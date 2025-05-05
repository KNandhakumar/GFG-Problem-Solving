package com.NkProblemSolving.MathProblems;

public class FindSumOfDigits {
    public static void main(String[] args) {
        int n = 456;
        int ans = 0;
        while (n>0){
            int remainder = n%10;
            ans += remainder;
            n= n/10;
        }
        System.out.println(ans);
    }
}
