package com.NkProblemSolving.Array.Level4;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {100, 50, 40, 20, 10};
        findMax(arr);
    }

    static void findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
