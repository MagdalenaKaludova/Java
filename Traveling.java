package WhileLoop;

import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 0;
        //int savedMoney = 0;
        while (true) {
            double savedMoney = 0;
            String destination = scanner.nextLine();

            if (destination.equals("End")) {
                break;
            }
            double budget = Double.parseDouble(scanner.nextLine());
            while (savedMoney < budget) {
                money = Double.parseDouble(scanner.nextLine());
                savedMoney += money;

            }
            if (savedMoney >= budget) {
                System.out.printf("Going to %s!%n", destination);
            }
        }
    }
}
