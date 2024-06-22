package ForLoop;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven = 0;
        for (int postion = 1; postion <= n; postion++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (postion % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }


        }
        if (sumEven == sumOdd) {
            System.out.println("Yes");
            System.out.println("Sum = " + (sumEven));
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sumEven - sumOdd));
        }

    }
}
