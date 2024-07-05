package PBExam6;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rent = Double.parseDouble(scanner.nextLine());
        double cakePrice = rent * 0.2;
        double drinksPrice = cakePrice * 0.55;
        double animatorPrice = rent / 3;
        double totalCost = rent + cakePrice + drinksPrice + animatorPrice;
        System.out.printf("%.1f", totalCost);
    }
}
