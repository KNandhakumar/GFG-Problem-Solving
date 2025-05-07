package com.NkProblemSolving.Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        int ans = reverseNum(n,0);
        System.out.println(ans);
    }

    static int reverseNum(int n,int reverse) {
        if (n==0){
            return reverse;
        }
        int remiander = n%10;
        reverse = reverse * 10 + remiander;
        return reverseNum(n/10,reverse);
    }
}
