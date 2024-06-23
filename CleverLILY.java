package ForLoop;

import java.util.Scanner;

public class CleverLILY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = Integer.parseInt(scanner.nextLine());
        double washingmashinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice= Integer.parseInt(scanner.nextLine());
        int toysCount=0;
        int money=0;
        int savedMoneyTracker=10;

        for (int i = 1; i <=years ; i++) {
            if (i%2==0)
            {
                money+=savedMoneyTracker;
                --money;
                savedMoneyTracker+=10;
            }
            else
            {
                toysCount++;
            }

        }
       int toysSum= toyPrice*toysCount;
        money+=toysSum;
        if (money>=washingmashinePrice)
        {
            System.out.printf("Yes! %.2f",money-washingmashinePrice);
        }
        else
        {
            System.out.printf("No! %.2f",washingmashinePrice-money);
        }
    }
}
