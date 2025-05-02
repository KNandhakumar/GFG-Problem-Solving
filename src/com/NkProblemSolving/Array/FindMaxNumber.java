package com.NkProblemSolving.Array;

public class FindMaxNumber {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 1};
        int ans = findMaxNum(arr);
        System.out.println(ans);
    }
    static int findMaxNum(int[] arr){
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxNum<arr[i]){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
}
