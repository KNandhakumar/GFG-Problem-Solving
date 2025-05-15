package com.NkProblemSolving.Array.Level3;

public class CheckElementExitsOrNot {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int target = 15;
        if (checkExistOrNot(arr,target)){
            System.out.println("Found index");
        }
        else {
            System.out.println("Not found");
        }
    }

    static boolean checkExistOrNot(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
