package ForLoop;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moves = Integer.parseInt(scanner.nextLine());
        double result = 0;
        double p1 = 0.00;
        double p2 = 0.00;
        double p3 = 0.00;
        double p4 = 0.00;
        double p5 = 0.00;
        double invalidNumber = 0.00;
        for (int i = 1; i <= moves; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 0 || number > 50) {
                invalidNumber++;
                result = result / 2;
            } else if (number <= 9) {
                result += number * 0.2;
                p1++;

            } else if (number <= 19) {
                result += number * 0.3;
                p2++;
            } else if (number <= 29) {
                result += number * 0.4;
                p3++;
            } else if (number <= 39) {
                result += 50;
                p4++;
            } else {
                result += 100;
                p5++;
            }


        }
        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", (p1 / moves) * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", (p2 / moves) * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", (p3 / moves) * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", (p4 / moves) * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", (p5 / moves) * 100);


        System.out.printf("Invalid numbers: %.2f%%", (invalidNumber / moves) * 100);
    }
}
