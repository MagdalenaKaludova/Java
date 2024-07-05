package PBExam6;

import java.util.Scanner;

public class CatWalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int walks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());
        int totalMinuteswalk = minutesWalk * walks;
        int burnedCalories = totalMinuteswalk * 5;


        if (burnedCalories >= (calories / 2)) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }

    }
}
