package com.NkProblemSolving.Array.Day2;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        removeDuplicates(arr);
    }

    static void removeDuplicates(int[] arr){
       int index = 0;
       // new array to store unique elements
       int[] uniqueArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == uniqueArray[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                uniqueArray[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.println(uniqueArray[i]);
        }
    }

    // Using Hashset for find unique elements
    // time complexity O(n)
    // space complexity O(n)
//    static void removeDuplicates(int[] arr) {
//        HashSet<Integer> uniqueElements = new HashSet<>();
//        for(int num:arr){
//            uniqueElements.add(num);
//        }
//        System.out.println(uniqueElements);
//    }
}
