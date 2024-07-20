package ExamPreparation;

import java.util.Scanner;

public class PcGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gamesSold = Integer.parseInt(scanner.nextLine());
        String gameName = "";

        int Hearthstone = 0;
        int Fornite = 0;
        int Overwatch = 0;
        int others = 0;
        int counter = 0;
        for (int i = 1; i <= gamesSold; i++) {
            gameName = scanner.nextLine();
            if (gameName.equals("Hearthstone")) {
                Hearthstone++;


            } else if (gameName.equals("Fornite")) {

                Fornite++;


            } else if (gameName.equals("Overwatch")) {
                Overwatch++;


            } else {
                others++;


            }


        }
        System.out.printf("Hearthstone - %.2f%%%n", ((Hearthstone * 1.0 / gamesSold) * 100));
        System.out.printf("Fornite - %.2f%%%n", ((Fornite * 1.0 / gamesSold) * 100));
        System.out.printf("Overwatch - %.2f%%%n", ((Overwatch * 1.0 / gamesSold) * 100));
        System.out.printf("Others - %.2f%%%n", ((others * 1.0 / gamesSold) * 100));
    }
}
