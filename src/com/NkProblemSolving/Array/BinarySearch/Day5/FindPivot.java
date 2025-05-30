package com.NkProblemSolving.Array.BinarySearch.Day5;

public class FindPivot {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 9, 1, 2, 3};
        System.out.println(findPivot(arr));
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            // case 1 : mid is pivot
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            // case 2 : mid-1 is pivot
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // if left side is sorted -> go right side because left is already sorted so,
            // we need to find the broken part that was is right side
            if (arr[start]<=arr[mid]){
                start = mid+1;
            }
            // if right side is sorted -> go to left side
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}
