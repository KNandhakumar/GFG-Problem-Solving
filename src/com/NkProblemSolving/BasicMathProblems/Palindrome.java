package com.NkProblemSolving.BasicMathProblems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/problems/palindrome0746/1
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPalindrome(n);
        System.out.println(ans);
    }
    public static boolean isPalindrome(int n) {
        int check = n;
        int reverse = 0;
        if (n==0){
            return false;
        }
        while (n>0){
            int rem = n%10;
            reverse = reverse*10+rem;
            n = n/10;
        }
        if (check==reverse){
            return true;
        }
        return false;
    }
}
