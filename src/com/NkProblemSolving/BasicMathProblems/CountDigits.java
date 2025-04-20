package com.NkProblemSolving.BasicMathProblems;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/problems/count-digits5716/0
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = evenlyDivides(n);
        System.out.println(ans);
    }
    static int evenlyDivides(int n) {
        int count = 0;
        int original = n;
        while (n>0){
            int rem = n%10;
            if (rem!=0 && original%rem == 0){
                count++;
            }
            n = n/10;
        }
        return count;
    }
}
