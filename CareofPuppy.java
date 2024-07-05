package PBExam6;

import java.util.Scanner;

public class CareofPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFoodInKG = Integer.parseInt(scanner.nextLine());
        int dogFood = dogFoodInKG * 1000;
        int totalDogFoodEaten = Integer.parseInt(scanner.nextLine());

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Adopted")) {
                break;
            }
            int foodEaten = Integer.parseInt(command);
            totalDogFoodEaten += foodEaten;

        }
        if (totalDogFoodEaten <= dogFood) {
            System.out.printf("Food is enough! Leftovers: %d grams.", (dogFood - totalDogFoodEaten));
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(totalDogFoodEaten - dogFood));
        }

    }

}