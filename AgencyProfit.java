package ProgrammingBasicsOnlineExam1;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String airline = scanner.nextLine();
        int adultsTicket = Integer.parseInt(scanner.nextLine());
        int childrenTicket = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double childrenTicketPrice = adultTicketPrice * 0.3;
        double totalCostAdults = (adultTicketPrice + tax) * adultsTicket;
        double totalCostChildren = (childrenTicketPrice + tax) * childrenTicket;
        double airlineProfit = (totalCostAdults + totalCostChildren) * 0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airline, airlineProfit);
    }
}
