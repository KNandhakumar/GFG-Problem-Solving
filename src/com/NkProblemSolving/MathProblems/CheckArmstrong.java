package com.NkProblemSolving.MathProblems;

public class CheckArmstrong {
    public static void main(String[] args) {
        int n = 153;
        checkArmstrong(n);
    }

    static void checkArmstrong(int n) {
        int originalNum = n;
        int result = 0;
        while (n>0){
            int remainder = n%10;
            result = (remainder*remainder*remainder)+result;
            n = n/10;
        }
        if (originalNum == result){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
