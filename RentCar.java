package CSAE;

import java.util.Scanner;

public class RentCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String grade = "";
        String car = "";
        double carCost = 0;

        if (budget <= 100) {
            grade = "Economy class";
            if (season.equals("Summer")) {
                car = "Cabrio";
                carCost = budget * 0.35;
            } else if (season.equals("Winter")) {
                car = "Jeep";
                carCost = budget * 0.65;
            }
//        } else if (budget > 100 && budget <= 500) {
        } else if (budget <= 500) {
            grade = "Compact class";
            if (season.equals("Summer")) {
                car = "Cabrio";
                carCost = budget * 0.45;
            } else if (season.equals("Winter")) {
                car = "Jeep";
                carCost = budget * 0.80;
            }
//        } else if (budget > 500) {
        } else {
            grade = "Luxury class";
            car = "Jeep";
            carCost = budget * 0.9;
        }
        System.out.printf("%s%n%s - %.2f", grade, car, carCost);
    }
}
