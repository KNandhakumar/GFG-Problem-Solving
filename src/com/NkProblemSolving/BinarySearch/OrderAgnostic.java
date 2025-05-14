package com.NkProblemSolving.BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
//        int[] arr = {90, 75, 18, 12, 6, 4, 3, 1};
        int[] arr = {1, 40, 50, 60};
        int target = 0;
        int ans = orderAgnostic(arr,target);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAscending = arr[start]<arr[end];
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (target==arr[mid]){
                return mid;
            }
            if (isAscending){
                // if this run , this is ascending order
                if (target>arr[mid]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            else {
                // if this run, this is descending order
                if (target>arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
