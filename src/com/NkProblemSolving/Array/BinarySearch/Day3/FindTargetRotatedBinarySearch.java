package com.NkProblemSolving.Array.BinarySearch.Day3;

public class FindTargetRotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2, 3, 4};
        int target = 3;
        System.out.println("Index : " + search(arr,target));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            // check which part is sorted
            if (arr[start]<=arr[mid]){ // left part is sorted
                if (target>=arr[start] && target<arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            // right part is sorted
            else {
                if (target>arr[mid] && target<=arr[end]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
