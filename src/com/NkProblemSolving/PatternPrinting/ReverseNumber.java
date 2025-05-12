package com.NkProblemSolving.PatternPrinting;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 5; i >= 1 ; i--) {
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
