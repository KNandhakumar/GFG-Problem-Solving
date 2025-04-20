package com.NkProblemSolving.PatternPrinting;

import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        patternPrinting(n);
    }
    static void patternPrinting(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
