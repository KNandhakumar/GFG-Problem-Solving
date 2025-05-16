package com.NkProblemSolving.Array.Level4;

public class FindSecondMax {
    public static void main(String[] args) {
        int[] arr = {100, 50, 40, 20, 10};
        findSecondMax(arr);
    }

    static void findSecondMax(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if (arr[i]>secondMax && arr[i]!=firstMax){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
