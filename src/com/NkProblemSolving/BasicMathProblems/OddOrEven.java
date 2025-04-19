package com.NkProblemSolving.BasicMathProblems;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isEven(n);
        System.out.println(ans);
    }
    static boolean isEven(int n) {
        if (n%2==0){
            return true;
        }
        return false;
    }
}
