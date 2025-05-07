package com.NkProblemSolving.Recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        int n = 121 , reverse = 0;
        int check = checkPalindrome(n,reverse);
        if (n == check){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    private static int checkPalindrome(int n, int reverse) {
        if (n==0){
            return reverse;
        }
        reverse = reverse * 10 + (n%10);
        return checkPalindrome(n/10,reverse);
    }
}
