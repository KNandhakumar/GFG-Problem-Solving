package com.NkProblemSolving.Recursion.Day2.Array;

public class FindFirstIndexOfTarget {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 6};
        int target = 6;
        int ans = findFirstIndex(arr,target,0);
        System.out.println(ans);
    }

    static int findFirstIndex(int[] arr, int target, int index) {
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return findFirstIndex(arr,target,index+1);
    }
}
