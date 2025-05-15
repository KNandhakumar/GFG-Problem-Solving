package com.NkProblemSolving.Array.Level3;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            if (arr[start]<arr[end]){
                // swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
