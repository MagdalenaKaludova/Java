package PBExam6;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String setSize = scanner.nextLine();
        int setQuantity = Integer.parseInt(scanner.nextLine());
        double price = 0.00;
        switch (fruit) {
            case "Watermelon" -> {
                if (setSize.equals("small")) {
                    price = (setQuantity * 2) * 56;
                } else if (setSize.equals("big")) {
                    price = (setQuantity * 5) * 28.70;
                }
            }
            case "Mango" -> {
                if (setSize.equals("small")) {
                    price = (setQuantity * 2) * 36.66;
                } else if (setSize.equals("big")) {
                    price = (setQuantity * 5) * 19.60;
                }
            }
            case "Pineapple" -> {
                if (setSize.equals("small")) {
                    price = (setQuantity * 2) * 42.10;
                } else if (setSize.equals("big")) {
                    price = (setQuantity * 5) * 24.80;
                }
            }
            case "Raspberry" -> {
                if (setSize.equals("small")) {
                    price = (setQuantity * 2) * 20;
                } else if (setSize.equals("big")) {
                    price = (setQuantity * 5) * 15.20;
                }
            }

        }
        if (price >= 400 && price <= 1000) {
            price *= 0.85;
        } else if (price > 1000) {
            price *= 0.5;
        }
        System.out.printf("%.2f lv.", price);
    }
}
