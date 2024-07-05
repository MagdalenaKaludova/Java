package PBExam6;

import java.util.Scanner;

public class ChangeBuro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoin = Integer.parseInt(scanner.nextLine());
        double uan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinInEuro = (bitcoin * 1168) / 1.95;
        double uanInEuro = (((uan * 0.15) * 1.76)) / 1.95;
        double totalinEuro = bitcoinInEuro + uanInEuro;
        double total = totalinEuro - ((commission / 100) * totalinEuro);
        System.out.printf("%.2f", total);


    }
}
