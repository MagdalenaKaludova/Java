package PBExam6;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        char sex = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double cost = 0;


        switch (sex) {
            case 'm' -> {
                switch (sport) {
                    case "Gym" -> cost = 42;
                    case "Boxing" -> cost = 41;
                    case "Yoga" -> cost = 45;
                    case "Zumba" -> cost = 34;
                    case "Dances" -> cost = 51;
                    case "Pilates" -> cost = 39;
                }

            }
            case 'f' -> {
                switch (sport) {
                    case "Gym" -> cost = 35;
                    case "Boxing" -> cost = 37;
                    case "Yoga" -> cost = 42;
                    case "Zumba" -> cost = 31;
                    case "Dances" -> cost = 53;
                    case "Pilates" -> cost = 37;
                }

            }
        }
        if (age <= 19) {
            double studentDiscount = 0.2 * cost;
            cost = cost - studentDiscount;
        }
        if (cost <= budget) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", cost - budget);
        }

    }
}
