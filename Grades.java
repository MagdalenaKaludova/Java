package ForLoop;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int excellent_students = 0;
        int good_students = 0;
        int average_students = 0;
        int failing_students = 0;
        double sumGrades = 0;
        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 5.00) {
                excellent_students++;
                sumGrades += grade;
            } else if (grade >= 4.00) {
                good_students++;
                sumGrades += grade;
            } else if (grade >= 3.00) {
                average_students++;
                sumGrades += grade;
            } else {
                failing_students++;
                sumGrades += grade;
            }

        }
        System.out.printf("Top students: %.2f%%%n", ((excellent_students * 1.00) / students) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", ((good_students * 1.00) / students) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", ((average_students * 1.00) / students) * 100);
        System.out.printf("Fail: %.2f%%%n", ((failing_students * 1.00) / students) * 100);

        System.out.printf("Average: %.2f", sumGrades / students);
    }
}
