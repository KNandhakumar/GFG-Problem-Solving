package com.NkProblemSolving.Array.Day2;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 12};
        int ans = secondLargestElement(arr);
        System.out.println(ans);
    }
    // brute force approach
//    static int secondLargestElement(int[] arr){
//        int firstLargest = 0;
//        int secondLargest = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>=firstLargest){
//                secondLargest = firstLargest;
//                firstLargest = arr[i];
//            }
//            else if (arr[i]<firstLargest && arr[i]>secondLargest){
//                secondLargest = arr[i];
//            }
//        }
//        return secondLargest;
//    }

    static int secondLargestElement(int[] arr){
        if (arr.length < 2){
            return -1;
        }
        int firstLargest = arr[0];
        int secondLargest = arr[1];
        if (secondLargest>firstLargest){
            int temp = secondLargest;
            secondLargest = firstLargest;
            firstLargest = temp;
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if (arr[i]>secondLargest && arr[i]!=firstLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
