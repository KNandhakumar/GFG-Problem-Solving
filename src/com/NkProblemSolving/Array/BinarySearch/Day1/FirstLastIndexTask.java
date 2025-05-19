package com.NkProblemSolving.Array.BinarySearch.Day1;

public class FirstLastIndexTask {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 4, 5};
        int target = 3;
        System.out.println("First Index at : " + searchFirstOccurrence(arr,target));
        System.out.println("Last Index at : " + searchLastOccurrence(arr,target));
    }

    static int searchFirstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (target==arr[mid]){
                ans = mid;
                end = mid-1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }

    static int searchLastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (target==arr[mid]){
                ans = mid;
                start = mid+1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }
}
