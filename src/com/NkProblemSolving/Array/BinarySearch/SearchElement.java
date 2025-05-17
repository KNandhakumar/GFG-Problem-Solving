package com.NkProblemSolving.Array.BinarySearch;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 70;
        searchElement(arr,target);
    }

    static void searchElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (target==arr[mid]){
                System.out.println("Index found at : " + mid);
                return;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        System.out.println("Not found");
    }
}
