package NestedLoops;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (i + j == k + l) {
                            if (N % (k + l) == 0) {
                                //if (i < 10 && j < 10 && k < 10 && l < 10) {
                                System.out.print(i + "" + j + "" + k + "" + l + " ");
                            }
                        }
                    }
                }
            }

        }

    }
}




