package com.NkProblemSolving.PatternPrinting.AdvancePatterns;

public class FloydTriangle {
    public static void main(String[] args) {
        int n = 1;
        for (int row = 1; row <= 5 ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
