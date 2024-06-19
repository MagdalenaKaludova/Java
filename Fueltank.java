package CSAE;

import com.sun.source.tree.IfTree;

import java.util.Scanner;


public class Fueltank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        int fuelLitters = Integer.parseInt(scanner.nextLine());
        if (fuelType.equals("Diesel")) {
            if (fuelLitters >= 25) {
                System.out.printf("You have enough " + "%s" + ".", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with " + "%s" + "!", fuelType.toLowerCase());

            }
        } else if (fuelType.equals("Gasoline")) {
            if (fuelLitters >= 25) {
                System.out.printf("You have enough " + "%s" + ".", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with " + "%s" + "!", fuelType.toLowerCase());

            }
        } else if (fuelType.equals("Gas")) {
            if (fuelLitters >= 25) {
                System.out.printf("You have enough " + "%s" + ".", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with " + "%s" + "!", fuelType.toLowerCase());

            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }


}


