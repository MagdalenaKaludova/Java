package WhileLoop;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double holidayCost = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());
        String action = "";
        int dayCounter = 0;
        int spendingDaysCounter = 0;

        while (ownedMoney < holidayCost && spendingDaysCounter < 5) {
            action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            dayCounter++;
            if (action.equals("spend")) {
                ownedMoney -= money;
                spendingDaysCounter++;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            } else if (action.equals("save")) {
                ownedMoney += money;
                spendingDaysCounter = 0;

            }
        }
        if (spendingDaysCounter == 5) {
            System.out.printf("You can't save the money.%n %d", dayCounter);
        } else if (ownedMoney>=holidayCost){
            System.out.printf("You saved the money for %d days.", dayCounter);
        }


    }
}
