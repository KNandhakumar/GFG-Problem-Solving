package com.NkProblemSolving.Recursion.Day2.Array;

public class SearchTarget {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;
        if (searchTarget(arr,target,0)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    static boolean searchTarget(int[] arr, int target, int index) {
        // base case searched all elements
        if (index==arr.length){
            return false;
        }
        if (arr[index] == target){
            return true;
        }
        // recursive call
        return searchTarget(arr,target,index+1);
    }
}
