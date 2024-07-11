package ExamPreparation;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int easterBreadsParticipant = Integer.parseInt(scanner.nextLine());
        int score = 0;
        int grade = 0;
        int bestScore = 0;
        String bakersName = "";
        String bestBakersName = "";
        for (int i = 1; i <= easterBreadsParticipant; i++) {
            score = 0;
            bakersName = scanner.nextLine();
            while (true) {
                String command = scanner.nextLine();
                if (command.equals("Stop")) {
                    break;
                }
                grade = Integer.parseInt(command);
                score += grade;
            }
            System.out.printf("%s has %d points.%n", bakersName, score);

            if (score > bestScore) {
                bestScore = score;
                bestBakersName = bakersName;
                System.out.printf("%s is the new number 1!%n", bakersName);
            }

        }
        System.out.printf("%s won competition with %d points!", bestBakersName, bestScore);
    }
}