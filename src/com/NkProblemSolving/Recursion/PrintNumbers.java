package com.NkProblemSolving.Recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }

    static void printNumbers(int n) {
        // base case when stop
        if (n==0){
            return;
        }
        printNumbers(n-1);
        System.out.println(n);
    }
}
