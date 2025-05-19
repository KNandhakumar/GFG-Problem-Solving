package com.NkProblemSolving.Array.BinarySearch.Day1;

import java.util.Arrays;

public class LeftRotateAnArrayByOnce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArrayOnce(arr);
    }

    static void rotateArrayOnce(int[] arr) {
        int lastIndex = arr.length-1;
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[lastIndex] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
