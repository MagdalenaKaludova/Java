package Exam;

import java.util.Scanner;

public class zadacha_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beers = Integer.parseInt(scanner.nextLine());
        int chipsBags = Integer.parseInt(scanner.nextLine());
        double beerPrice = 1.20;
        double beerTotal = beers * beerPrice;
        double chipsPrice = Math.ceil((beerTotal * 0.45) * chipsBags);
        double cost = chipsPrice + beerTotal;
        if (cost <= budget) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, budget - cost);
        } else {
            System.out.printf("%s needs %.2f more leva!", name, cost - budget);
        }
    }
}
