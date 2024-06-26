package ForLoop;

import java.util.Scanner;

public class MonthlyBills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double waterBill = 0.00;
        double internetBill = 0.00;
        double others = 0;
        double average = 0.00;
        double electricityBill = 0.00;
        for (int i = 1; i <= months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            waterBill += 20;
            internetBill += 15;
            electricityBill += electricity;
            others = (electricityBill + waterBill + internetBill) * 1.2;
        }
        average = (electricityBill + waterBill + internetBill + others) / months;
        System.out.printf("Electricity: %.2f lv%nWater: %.2f lv%nInternet: %.2f lv%nOther: %.2f lv%nAverage: %.2f lv", electricityBill, waterBill, internetBill, others, average);

    }
}
