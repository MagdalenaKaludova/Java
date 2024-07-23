package NestedLoops;

import java.util.Scanner;

public class PINcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumberMAX = Integer.parseInt(scanner.nextLine());
        int secondNumberMAX = Integer.parseInt(scanner.nextLine());
        int thirdNumberMAX = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= firstNumberMAX; i++) {
            for (int j = 1; j <= secondNumberMAX; j++) {
                for (int k = 1; k <= thirdNumberMAX; k++) {
                    if (i % 2 == 0 && k % 2 == 0) {
                        if (j == 2 || j <= 7 && j % 2 != 0 && j != 1) {

                            System.out.println(i + " " + j + " " + k);
                        }
                    }
                }
            }

        }

    }
}
