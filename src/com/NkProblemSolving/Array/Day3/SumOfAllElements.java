package com.NkProblemSolving.Array.Day3;

public class SumOfAllElements {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
