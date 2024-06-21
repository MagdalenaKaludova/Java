import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniorBikers = Integer.parseInt(scanner.nextLine());
        int seniorBikers = Integer.parseInt(scanner.nextLine());
        int bikers = juniorBikers + seniorBikers;
        String trace = scanner.nextLine();
        double juniorTax = 0.00;
        double seniorTax = 0.00;


        if (trace.equals("trail")) {
            juniorTax = juniorBikers * 5.5;
            seniorTax = seniorBikers * 7;
        } else if (trace.equals("cross-country")) {
            juniorTax = juniorBikers * 8;
            seniorTax = seniorBikers * 9.50;

        } else if (trace.equals("downhill")) {
            juniorTax = juniorBikers * 12.25;
            seniorTax = seniorBikers * 13.75;
        } else if (trace.equals("road")) {
            juniorTax = juniorBikers * 20;
            seniorTax = seniorBikers * 21.50;
        }
        double totalTax = juniorTax + seniorTax;
        if (trace.equals("cross-country") && bikers >= 50) {
            totalTax *= 0.75;
        }
        totalTax *= 0.95;

        System.out.printf("%.2f", totalTax);
    }
}
