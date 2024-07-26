package NestedLoops;

import java.util.Scanner;

public class SecretDoor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        boolean isThereCombination = false;

        int combination = 0;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {

                sum = i + j;
                combination++;
                if (sum == magicNumber) {
                    isThereCombination = true;
                    System.out.printf("Combination N:%d ", combination);
                    System.out.printf("(%d + %d = %d)", i, j, sum);
                    break;
                }

            }

            if (sum == magicNumber) {
                break;


            }
        }
        if (!isThereCombination) {
            System.out.printf("%d combinations - neither equals %d", combination, magicNumber);
        }

    }
}

