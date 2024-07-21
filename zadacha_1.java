package Exam;

import java.util.Scanner;

public class zadacha_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int location = Integer.parseInt(scanner.nextLine());
        double expectedAverageGoldPerDay = 0;
        double goldPerDay = 0;
        int days = 0;
        double goldTotal = 0;
        double averageGold = 0;
        for (int i = 1; i <= location; i++) {
            averageGold = 0;
            goldTotal = 0;
            expectedAverageGoldPerDay = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            for (int j = 1; j <= days; j++) {
                goldPerDay = Double.parseDouble(scanner.nextLine());
                goldTotal += goldPerDay;

            }
            averageGold = goldTotal / days;
            if (averageGold >= expectedAverageGoldPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGold);
            } else {
                System.out.printf("You need %.2f gold.%n", expectedAverageGoldPerDay - averageGold);
            }
        }
    }
}
