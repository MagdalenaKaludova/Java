package NestedLoops;

import java.util.Scanner;

public class TheWheelSong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = Integer.parseInt(scanner.nextLine());
        int controlValue = 0;
        int count = 0;
        String password = "";
        boolean isThereAfour = false;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        controlValue = i * j + l * k;

                        if (controlValue == M && i < j && k > l) {
                            count++;
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                            if (count == 4) {
                                isThereAfour = true;
                                password = String.valueOf(i) + String.valueOf(j) + String.valueOf(k) + String.valueOf(l);
                            }
                        }
                    }
                }
            }

        }
        if (isThereAfour) {
            System.out.printf("%nPassword: %s", password);
        } else {
            System.out.printf("%nNo!");
        }

    }
}
