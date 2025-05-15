package com.NkProblemSolving.Array.Level3;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 9, 1};
        int target = 7;
        linearSearch(arr,target);
    }

    static void linearSearch(int[] arr, int target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                found = true;
                System.out.println("Found at index : " + i);
                break;
            }
        }
        if (!found){
            System.out.println("Not found");
        }
    }
}
