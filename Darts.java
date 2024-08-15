package ExamPreparation;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        int startingPoints = 301;
        int successfulshots = 0;
        int unsuccessfulshots = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Retire")) {
                System.out.printf("%s retired after %d unsuccessful shots.", playerName, unsuccessfulshots);
                break;
            }
            int points = Integer.parseInt(scanner.nextLine());


            if (input.equals("Triple")) {
                points *= 3;
                if (points > startingPoints) {
                    unsuccessfulshots++;
                } else {
                    startingPoints -= points;
                    successfulshots++;
                }
            } else if (input.equals("Double")) {
                points *= 2;
                if (points > startingPoints) {
                    unsuccessfulshots++;
                } else {
                    startingPoints -= points;
                    successfulshots++;
                }
            } else if (input.equals("Single")) {
                if (points > startingPoints) {
                    unsuccessfulshots++;
                } else {
                    startingPoints -= points;
                    successfulshots++;
                }

            }
            if (startingPoints == 0) {
                System.out.printf("%s won the leg with %d shots.", playerName, successfulshots);
                break;
            }

        }

    }
}
