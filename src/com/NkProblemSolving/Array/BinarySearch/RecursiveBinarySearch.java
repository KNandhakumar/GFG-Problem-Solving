package com.NkProblemSolving.Array.BinarySearch;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 4;
        int ans = recursionBinarySearch(arr,target,0,arr.length-1);
        if (ans!=-1){
            System.out.println("Index found at : " + ans);
        }
        else {
            System.out.println("Index not found");
        }
    }

    static int recursionBinarySearch(int[] arr, int target, int start, int end) {
        // base case
        if (start>end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target==arr[mid]){
            return mid;
        }
        else if (target>arr[mid]){
            return recursionBinarySearch(arr,target,mid+1,end);
        }
        else {
            return recursionBinarySearch(arr,target,start,mid-1);
        }
    }
}
