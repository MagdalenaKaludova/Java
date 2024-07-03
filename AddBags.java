package ProgrammingBasicsOnlineExam1;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double over20kgPrice = Double.parseDouble(scanner.nextLine());
        double luggageKg = Double.parseDouble(scanner.nextLine());
        int daysUntilTrip = Integer.parseInt(scanner.nextLine());
        int quantityLuggage = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        if (luggageKg < 10) {
            totalPrice = over20kgPrice * 0.2;
        } else if (luggageKg <= 20) {
            totalPrice = over20kgPrice * 0.5;
        } else if (luggageKg > 20) {
            totalPrice = over20kgPrice;
        }

        if (daysUntilTrip > 30) {
            totalPrice *= 1.10;
        } else if (daysUntilTrip <= 30 && daysUntilTrip >= 7) {
            totalPrice *= 1.15;
        } else if (daysUntilTrip < 7) {
            totalPrice *= 1.4;
        }
        System.out.printf("The total price of bags is: %.2f lv.", totalPrice * quantityLuggage);

    }
}
