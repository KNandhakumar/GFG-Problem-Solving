package com.NkProblemSolving.Array.Day2;

public class SumOfElementsEvenIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int ans = sumOfElements(arr);
        System.out.println(ans);
    }

    static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0){
                sum += arr[i];
            }
        }
        return sum;
    }
}
