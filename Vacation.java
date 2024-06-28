package ForLoop;

import java.util.Scanner;
import java.util.SortedMap;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = "";
        String acommodation = "";
        double cost = 0;
        switch (season) {
            case "Summer" -> {
                location = "Alaska";
                if (budget <= 1000) {
                    acommodation = "Camp";
                    cost = 0.65 * budget;
                } else if (budget <= 3000) {

                    acommodation = "Hut";
                    cost = 0.80 * budget;
                } else if (budget > 3000) {
                    acommodation = "Hotel";
                    cost = 0.90 * budget;
                }
            }
            case "Winter" -> {
                location = "Morocco";
                if (budget <= 1000) {
                    acommodation = "Camp";
                    cost = 0.45 * budget;
                } else if (budget <= 3000) {

                    acommodation = "Hut";
                    cost = 0.60 * budget;
                } else if (budget > 3000) {
                    acommodation = "Hotel";
                    cost = 0.90 * budget;
                }
            }
        }
        System.out.printf("%s - %s - %.2f", location, acommodation, cost);

    }
}
