package ForLoop;

import java.util.Scanner;

public class BackToPast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritance = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        int years_old = 18;
        double expense = 0.00;
        for (int i = 1800; i <= year; i++) {

            if (i % 2 == 0) {
                expense += 12000;

            } else {

                expense += 12000 + (50 * years_old);
            }
            years_old++;
        }
        if (inheritance >= expense) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", (inheritance - expense));
        } else
            System.out.printf("He will need %.2f dollars to survive.", (expense - inheritance));
    }
}
