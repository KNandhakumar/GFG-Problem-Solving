package com.NkProblemSolving.Recursion.Day2.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIndicesOfTarget {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        int target = 2;
        ArrayList<Integer> ans = new ArrayList<>();
        findIndices(arr,target,0,ans);
        System.out.println(ans);
    }

    static ArrayList<Integer> findIndices(int[] arr, int target, int index,ArrayList<Integer> list) {
        if (index==arr.length){
            return list;
        }
        if (target==arr[index]){
            list.add(index);
        }
        return findIndices(arr,target,index+1,list);
    }
}
