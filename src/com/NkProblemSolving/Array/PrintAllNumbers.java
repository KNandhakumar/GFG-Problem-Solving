package com.NkProblemSolving.Array;

public class PrintAllNumbers {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        printAllElements(arr);
    }
    static void printAllElements(int[] arr){
        for(int num:arr){
            System.out.println(num);
        }
    }
}
