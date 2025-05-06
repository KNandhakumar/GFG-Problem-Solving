package com.NkProblemSolving.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }

    static int factorial(int n) {
        if (n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
