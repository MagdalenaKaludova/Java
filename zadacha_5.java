package Exam;

import java.util.Scanner;

public class zadacha_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int adults = 0;
        int kids = 0;
        int moneyForToys = 0;
        int moneyForSweaters = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Christmas")) {
                break;
            }
            int age = Integer.parseInt(input);
            if (age > 16) {
                adults++;
            } else {
                kids++;
            }

        }
        moneyForToys = kids * 5;
        moneyForSweaters = adults * 15;
        System.out.printf("Number of adults: %d%n", adults);
        System.out.printf("Number of kids: %d%n", kids);
        System.out.printf("Money for toys: %d%n", moneyForToys);
        System.out.printf("Money for sweaters: %d%n", moneyForSweaters);

    }
}
