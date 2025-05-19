package com.NkProblemSolving.Array.BinarySearch.Day1;

public class FindRotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int ans = search(arr,target);
        System.out.println("Index : " + ans);
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (target==arr[mid]){
                return mid;
            }
            // left side is sorted
            if (arr[start]<=arr[mid]){
                // search left side
                if (target>=arr[start] && target<arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            // right side is sorted
            else {
                // search right
                if (target>arr[mid] && target<=arr[end]){
                    start = mid+1;
                }
                // search left
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
