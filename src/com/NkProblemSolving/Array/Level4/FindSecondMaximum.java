package com.NkProblemSolving.Array.Level4;

public class FindSecondMaximum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 99, 50};
        int ans = findSecondMaximum(arr);
        System.out.println(ans);
    }

    static int findSecondMaximum(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (firstMax<arr[i]){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if (arr[i]>secondMax && arr[i]!=firstMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
