package com.NkProblemSolving.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
    }
    static void reverseArray(int[] arr){
        int[] newArr = new int[arr.length];
        int index = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            newArr[index] = arr[i];
            index--;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
