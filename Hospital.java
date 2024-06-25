package ForLoop;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int doctors = 7;
        int days = Integer.parseInt(scanner.nextLine());
        int treated_patients = 0;
        int untreated_patients = 0;
        for (int i = 1; i <= days; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && untreated_patients > treated_patients) {
                doctors++;
            }
            if (patients <= doctors) {
                treated_patients += patients;
            } else {
                treated_patients += doctors;
                untreated_patients = (untreated_patients + patients) - doctors;
            }

        }
        System.out.printf("Treated patients: %d.%n", treated_patients);
        System.out.printf("Untreated patients: %d.", untreated_patients);

    }
}
