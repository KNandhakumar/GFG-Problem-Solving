package com.NkProblemSolving.Array.Level3;

import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        linearSearch(arr,target);
        reverseArray(arr);
    }

    static void linearSearch(int[] arr, int target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                found = true;
                System.out.println("Index found at : " + i);
                break;
            }
        }
        if (!found){
            System.out.println("Not found");
        }
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
