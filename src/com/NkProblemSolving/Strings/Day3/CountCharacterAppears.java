package com.NkProblemSolving.Strings.Day3;

import java.util.Scanner;

public class CountCharacterAppears {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        char search = 'o';
        countCharacters(name,search);
    }

    static void countCharacters(String name,char search) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (search==name.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
