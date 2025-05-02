package com.NkProblemSolving.Array;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] arr = {8, 4, 6, 2, 9};
        int ans = findMinNumber(arr);
        System.out.println(ans);
    }
    static int findMinNumber(int[] arr){
        int minNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minNum>arr[i]){
                minNum = arr[i];
            }
        }
        return minNum;
    }
}
