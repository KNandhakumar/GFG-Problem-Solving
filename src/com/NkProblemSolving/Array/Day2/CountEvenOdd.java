package com.NkProblemSolving.Array.Day2;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        countOddEven(arr);
    }

    static void countOddEven(int[] arr) {
        int oodCount = 0;
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2==1){
                oodCount++;
                System.out.println("Odd Number : " + arr[i]);
            }
            else {
                evenCount++;
                System.out.println("Even Number : " + arr[i]);
            }
        }
        System.out.println("Odd numbers count : " + oodCount + " , Even numbers count : " + evenCount);
    }
}
