package com.NkProblemSolving.MathProblems;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int n = 5;
        int ans = 1;
        for (int i = n; i >=1 ; i--) {
            ans = ans*i;
        }
        System.out.println(ans);
    }
}
