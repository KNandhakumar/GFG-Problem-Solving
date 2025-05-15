package com.NkProblemSolving.Array.SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 3};
        selectionSort(arr);
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int midIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[midIndex]){
                    midIndex = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[midIndex];
            arr[midIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
