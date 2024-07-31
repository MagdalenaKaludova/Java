package ExamPreparation;

import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int games = 0;
        int lost = 0;
        int win = 0;

        while (true) {
            String name = scanner.nextLine();
            if (name.equals("End of tournaments")) {
                break;
            }

            int tournamentsCount = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= tournamentsCount; i++) {
                games++;
                int pointDesiTeam = Integer.parseInt(scanner.nextLine());
                int pointOpponentTeam = Integer.parseInt(scanner.nextLine());
                if (pointDesiTeam > pointOpponentTeam) {
                    win++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, name, pointDesiTeam - pointOpponentTeam);
                } else {
                    lost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, name, pointOpponentTeam - pointDesiTeam);
                }

            }
        }
        System.out.printf("%.2f%% matches win%n", (win * 1.0 / games * 100));
        System.out.printf("%.2f%% matches lost", (lost * 1.0 / games * 100));

    }
}
