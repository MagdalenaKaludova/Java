package ForLoop;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cargo = Integer.parseInt(scanner.nextLine());
        double bus=0;
        double truck= 0;
        double train = 0;
        int totalLoad =0;
        double price=0;
        double totalPrice=0;
        for (int i = 1; i <=cargo ; i++)
        {
            int cargoTonnage = Integer.parseInt(scanner.nextLine());
            totalLoad += cargoTonnage;
            if (cargoTonnage<=3)
            {
               price=200.00*cargoTonnage;
               totalPrice+=price;
               bus+=cargoTonnage;
            }
            else if (cargoTonnage<=11)
            {
                price=175*cargoTonnage;
                totalPrice+=price;
                truck+=cargoTonnage;
            }
            else
            {
                price=120*cargoTonnage;
                totalPrice+=price;
                train+=cargoTonnage;
            }
        }
        System.out.printf("%.2f%n",totalPrice/totalLoad);
        System.out.printf("%.2f%%%n",(bus/totalLoad)*100);
        System.out.printf("%.2f%%%n",(truck/totalLoad)*100);
        System.out.printf("%.2f%%%n",(train/totalLoad)*100);

    }
}
