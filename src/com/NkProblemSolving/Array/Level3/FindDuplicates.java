package com.NkProblemSolving.Array.Level3;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 4, 9};
        findDuplicates(arr);
    }

    static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
