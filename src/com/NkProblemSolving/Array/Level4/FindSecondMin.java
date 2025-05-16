package com.NkProblemSolving.Array.Level4;

public class FindSecondMin {
    public static void main(String[] args) {
        int[] arr = {100, 50, 40, 20, 10};
        findSecondMax(arr);
    }

    static void findSecondMax(int[] arr) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<firstMin){
                secondMin = firstMin;
                firstMin = arr[i];
            }
            else if (arr[i]<secondMin && arr[i]!=firstMin){
                secondMin = arr[i];
            }
        }
        System.out.println(secondMin);
    }
}
