package CSAE;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contractTime = scanner.nextLine();
        String contractType = scanner.nextLine();
        String includeInternet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double tax = 0;
        double totalCost = 0;
        if (contractTime.equals("one") && contractType.equals("Small")) {
            tax = 9.98;
        } else if (contractTime.equals("one") && contractType.equals("Middle")) {
            tax = 18.99;
        } else if (contractTime.equals("one") && contractType.equals("Large")) {
            tax = 25.98;
        } else if (contractTime.equals("one") && contractType.equals("ExtraLarge")) {
            tax = 35.99;
        }


        if (contractTime.equals("two") && contractType.equals("Small")) {
            tax = 8.58;
        } else if (contractTime.equals("two") && contractType.equals("Middle")) {
            tax = 17.09;
        } else if (contractTime.equals("two") && contractType.equals("Large")) {
            tax = 23.59;
        } else if (contractTime.equals("two") && contractType.equals("ExtraLarge")) {
            tax = 31.79;
        }

        switch (includeInternet)
        {
            case "yes" -> {
                if (tax <= 10.00) {
                    totalCost = (tax + 5.50) * months;
                } else if (tax <= 30.00) {
                    totalCost = (tax + 4.35) * months;

                } else if (tax > 30.00) {
                    totalCost = (tax + 3.85) * months;

                }
            }
            case "no" -> totalCost = tax * months;
        }
        if (contractTime.equals("two"))
        {
            totalCost*=0.9625;
        }
        System.out.printf("%.2f lv.",totalCost);

    }
}
