package WhileLoop;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int detergentBottles = Integer.parseInt(scanner.nextLine());
        int detergentBottlesInMilliliter = detergentBottles * 750;
        int days = 0;
        int usedDetergent = 0;
        int dishes = 0;
        int pots = 0;

        while (true) {
            days++;
            String command = scanner.nextLine();
            if (!command.equals("End")) {
                int kitchenware = Integer.parseInt(command);

                if (days % 3 == 0) {
                    usedDetergent = kitchenware * 15;
                    pots += kitchenware;
                    detergentBottlesInMilliliter -= usedDetergent;
                } else {
                    usedDetergent = kitchenware * 5;
                    dishes += kitchenware;
                    detergentBottlesInMilliliter -= usedDetergent;
                }
            }


            if (command.equals("End")) {
                System.out.printf("Detergent was enough!%n%d dishes and %d pots were washed.%n", dishes, pots);
                System.out.printf("Leftover detergent %d ml.", detergentBottlesInMilliliter);
                break;
            }
            if (detergentBottlesInMilliliter < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentBottlesInMilliliter));
                break;
            }

        }


    }
}
