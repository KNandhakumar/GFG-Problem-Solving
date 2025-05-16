package com.NkProblemSolving.Array.Level4;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {100, 50, 40, 20, 10};
        findMin(arr);
    }

    static void findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
