package com.NkProblemSolving.Array.BinarySearch.Day1;

public class FirstFirstLastIndex {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 8, 10};
        int target = 4;
        System.out.println("First Index : " + searchFirst(arr,target));
        System.out.println("Last Index : " + searchLast(arr,target));
    }

    static int searchFirst(int[] arr, int target) {
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

    private static int searchLast(int[] arr, int target) {
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
