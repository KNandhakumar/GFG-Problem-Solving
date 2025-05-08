package com.NkProblemSolving.Recursion.Day2.Array;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7};
        if (checkArraySort(arr,0)){
            System.out.println("Arrays is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }

    static boolean checkArraySort(int[] arr, int index) {
        // base case
        // for array problems, pass index and array as parameters
        if (index==arr.length-1){
            return true;
        }
        if (arr[index] > arr[index+1]){
            return false;
        }
        // recursive call
        return checkArraySort(arr,index+1);
    }
}
