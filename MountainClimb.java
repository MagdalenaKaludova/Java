package PBExam6;

import java.util.Scanner;

public class MountainClimb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double dilay = Math.floor((distance / 50)) * 30;
        double GeorgiTime = (timePerMeter * distance) + dilay;
        if (GeorgiTime < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", GeorgiTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", GeorgiTime - record);
        }


    }
}
