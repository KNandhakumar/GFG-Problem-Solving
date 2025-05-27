package com.NkProblemSolving.Array.BinarySearch.Day4;

public class RotatedBinarySearchWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 4 ,2};
        int target = 3;
        System.out.println(search(arr,target));
    }

    static boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (target==arr[mid]){
                return true;
            }
            // if duplicates, we can move
            if (arr[start]==arr[mid] && arr[mid]==arr[end]){
                start++;
                end--;
            }
            // left side is sorted
            else if (arr[start]<=arr[mid]){
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
                // search side part
                if (target>arr[mid] && target<=arr[end]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return false;
    }
}
