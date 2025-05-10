package com.NkProblemSolving.Recursion.PatterPrinting;

public class Pattern1 {
    public static void main(String[] args) {
        int row = 4;
        printPatter(row,0);
    }

    static void printPatter(int row, int col) {
        if (row==0){
            return;
        }
        if (col<row){
            System.out.print("*");
            printPatter(row,col+1);
        }
        else {
            System.out.println();
            printPatter(row-1,0);
        }
    }
}
