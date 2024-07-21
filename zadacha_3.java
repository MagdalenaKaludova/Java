package Exam;

import java.util.Scanner;

public class zadacha_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pastry = scanner.nextLine();
        int pastryQuantity = Integer.parseInt(scanner.nextLine());
        int date = Integer.parseInt(scanner.nextLine());
        double cost = 0;
        switch (pastry) {
            case "Cake" -> {
                if (date <= 15) {
                    cost = 24 * pastryQuantity;
                } else if (date > 15) {
                    cost = 28.70 * pastryQuantity;
                }
            }
            case "Souffle" -> {
                if (date <= 15) {
                    cost = 6.66 * pastryQuantity;
                } else if (date > 15) {
                    cost = 9.80 * pastryQuantity;
                }
            }
            case "Baklava" -> {
                if (date <= 15) {
                    cost = 12.6 * pastryQuantity;
                } else if (date > 15) {
                    cost = 16.98 * pastryQuantity;
                }
            }
        }
        if (date <= 22 && cost >= 100 && cost <= 200) {
            cost *= 0.85;
        } else if (date <= 22 && cost > 200) {
            cost *= 0.75;
        }

        if (date <= 15) {
            cost *= 0.9;
        }
        System.out.printf("%.2f", cost);
    }
}
