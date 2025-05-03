package com.NkProblemSolving.Array.Day2;

public class CountNumberAppears {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 2, 5};
        int target = 2;
        int ans = countNumber(arr,target);
        System.out.println(ans);
    }
    static int countNumber(int[] arr,int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                count++;
            }
        }
        return count;
    }
}
