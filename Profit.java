package NestedLoops;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int onelev = Integer.parseInt(scanner.nextLine());
        int twoLeva = Integer.parseInt(scanner.nextLine());
        int fiveLeva = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;


        for (int i = 0; i <= onelev; i++) {
            for (int j = 0; j <= twoLeva; j++) {
                for (int k = 0; k <= fiveLeva; k++) {
                    totalSum = (i * 1 + j * 2 + k * 5);
                    if (totalSum == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }
            }

        }


    }
}
