package com.NkProblemSolving.Array;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int ans = sumOfNum(arr);
        System.out.println(ans);
    }
    static int sumOfNum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        return sum;
    }
}
