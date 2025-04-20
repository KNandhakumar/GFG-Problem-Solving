package com.NkProblemSolving.BasicMathProblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/problems/prime-numbe7r2314/1
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n) {
        if (n<=1){
            return false;
        }
        for (int i = 2; i * i <= n ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
