package ProgrammingBasicsOnlineExam1;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int windows = Integer.parseInt(scanner.nextLine());
        String windowType = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;
        if (windows <= 10) {
            System.out.println("Invalid order");
            return;
        }


        switch (windowType) {
            case "90X130" -> {
                price = windows * 110;
                if (windows > 60) {
                    price *= 0.92;
                } else if (windows > 30) {
                    price *= 0.95;

                }
            }
            case "100X150" -> {
                price = windows * 140;
                if (windows > 80) {
                    price *= 0.90;
                } else if (windows > 40) {
                    price *= 0.94;
                }
            }
            case "130X180" -> {
                price = windows * 190;
                if (windows > 50) {
                    price *= 0.88;
                } else if (windows > 20) {
                    price *= 0.93;
                }
            }
            case "200X300" -> {
                price = windows * 250;
                if (windows > 50) {
                    price *= 0.86;
                } else if (windows > 25) {
                    price *= 0.91;
                }
            }
        }


        if (delivery.equals("With delivery")) {
            price += 60;
        }
        if (windows > 99) {
            price*=0.96;
        }

        System.out.printf("%.2f BGN%n", price);
    }

}
