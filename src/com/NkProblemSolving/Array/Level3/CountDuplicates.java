package com.NkProblemSolving.Array.Level3;

public class CountDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2};
        int target = 2;
        int ans = findDuplicates(arr,target);
        System.out.println(ans);
    }

    static int findDuplicates(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                count++;
            }
        }
        return count;
    }
}
