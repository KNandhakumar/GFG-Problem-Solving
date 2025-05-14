package com.NkProblemSolving.BinarySearch;

public class findTarget {
    public static void main(String[] args) {
        int[] arr = {10, 12, 13, 15, 20};
        int target = 21;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (target==arr[mid]){
                return mid;
            }
            if (target>arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}
