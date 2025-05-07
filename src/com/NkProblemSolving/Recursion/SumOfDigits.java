package com.NkProblemSolving.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 456;
        int ans = sumOfDigits(num);
        System.out.println(ans);
    }

    static int sumOfDigits(int num) {
        // base case
        if (num==0){
            return 0;
        }
        int remainder = num%10;
        return remainder + sumOfDigits(num/10);
    }
}
