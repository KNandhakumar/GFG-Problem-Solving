package com.NkProblemSolving.Array.Day2;

public class SearchNumber {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 5};
        int target = 9;
        searchingNumber(arr,target);
    }
    static void searchingNumber(int[] arr,int target){
        if (arr.length==0){
            System.out.println("No values in this array");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                System.out.println("Target found");
                return;
            }
        }
        System.out.println("Not found");
    }
}
