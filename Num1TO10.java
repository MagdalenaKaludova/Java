package ForLoop;

import java.util.Scanner;

public class Num1TO10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double n = Double.parseDouble(scanner.nextLine());

            if (n < 0) {
                System.out.println("Negative number!");
                break;
            }
            double result = n * 2;
            System.out.printf("Result: %.2f%n", result);


        }
    }
}
