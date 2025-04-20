package com.NkProblemSolving.BasicMathProblems;

import java.util.Scanner;

public class ReverseNumber {
// 	https://www.geeksforgeeks.org/problems/reverse-digit0316/1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = reverseDigits(n);
        System.out.println(ans);
    }
    public static int reverseDigits(int n) {
        int reverse = 0;
        while (n>0){
            int remainder = n%10;
            reverse = reverse*10+remainder;
            n = n/10;
        }
        return reverse;
    }
}
