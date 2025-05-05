package com.NkProblemSolving.MathProblems;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int n = 7890;
        int count = 0;
        while (n>0){
            int remainder = n%10;
            count++;
            n = n/10;
        }
        System.out.println(count);
    }
}
