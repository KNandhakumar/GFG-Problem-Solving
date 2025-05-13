package com.NkProblemSolving.PatternPrinting.AdvancePatterns;

public class RightAlignedTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n ; i++) {
            for (int space = 1; space <= n-i ; space++) {
                System.out.print(" ");
            }
            for (int start = 1; start <= i ; start++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
