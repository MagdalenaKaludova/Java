package Exam;

import java.util.Scanner;

public class zadacha_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int videoCardPrice = Integer.parseInt(scanner.nextLine());
        int transitionCardPrice = Integer.parseInt(scanner.nextLine());
        double electricityPerCardPrice = Double.parseDouble(scanner.nextLine());
        double profitFromOneCard = Double.parseDouble(scanner.nextLine());
        int component = 1000;
        int cardsTotal = 13 * videoCardPrice;
        int transitionTotal = 13 * transitionCardPrice;
        int spendMoney = component + cardsTotal + transitionTotal;
        double totalProfit = (profitFromOneCard - electricityPerCardPrice) * 13;
        System.out.println(spendMoney);
        double days = Math.ceil(spendMoney / totalProfit);
        System.out.printf("%.0f", days);
    }
}

