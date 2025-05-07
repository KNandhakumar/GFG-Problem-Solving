package com.NkProblemSolving.Recursion;

public class CountNumberOfZeros {
    public static void main(String[] args) {
        int num = 10040;
        int ans = countZeros(num);
        System.out.println(ans);
    }

    static int countZeros(int num) {
        int count = 0;
        if (num == 0){
            return 0;
        }
        int remainder = num%10;
        if (remainder == 0){
            count++;
        }
        return count + countZeros(num/10);
    }
}
