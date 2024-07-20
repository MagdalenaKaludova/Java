package ExamPreparation;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wallHeight = Integer.parseInt(scanner.nextLine());
        int wallWidth = Integer.parseInt(scanner.nextLine());
        int percentAreaDoorAndWindows = Integer.parseInt(scanner.nextLine());
        double areaDoorAndWindows = (percentAreaDoorAndWindows * 1.0) / 100;
        double areaForPainting = ((wallHeight * wallWidth * 4)) * (1 - areaDoorAndWindows);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Tired!")) {
                System.out.printf("%.0f quadratic m left.", Math.ceil(areaForPainting));
                break;
            }
            int paintLiters = Integer.parseInt(input);
            if (areaForPainting < paintLiters) {
                System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(areaForPainting - paintLiters));
                break;
            }
            areaForPainting -= paintLiters;
            if (areaForPainting < 1) {
                System.out.println("All walls are painted! Great job, Pesho!");
                break;
            }


        }

    }
}
