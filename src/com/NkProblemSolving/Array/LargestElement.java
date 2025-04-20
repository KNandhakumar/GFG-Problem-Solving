package com.NkProblemSolving.Array;

public class LargestElement {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0
        int[] arr = {1, 8, 7, 56, 90};
        int ans = largest(arr);
        System.out.println(ans);
    }
    public static int largest(int[] arr) {
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (large<=arr[i]){
                large = arr[i];
            }
        }
        return large;
    }
}
