package WhileLoop;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGradesLimit = Integer.parseInt(scanner.nextLine());
        int badGradesCounter = 0;
        int sumGrades = 0;
        String lastTask = "";
        int numberOfProblems = 0;

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Enough")) {

                System.out.printf("Average score: %.2f%n", (sumGrades / (numberOfProblems * 1.00)));
                System.out.printf("Number of problems: %d%n", numberOfProblems);
                System.out.printf("Last problem: %s", lastTask);
                break;
            }

            String task = command;
            lastTask = task;
            int grade = Integer.parseInt(scanner.nextLine());
            numberOfProblems++;
            sumGrades += grade;


            if (grade <= 4) {
                badGradesCounter++;
                if (badGradesCounter == badGradesLimit) {
                    System.out.printf("You need a break, %d poor grades.", badGradesCounter);
                    break;
                }
            }


        }

    }
}
