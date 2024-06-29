package WhileLoop;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
       // String book = scanner.nextLine();
        int count = 0;
        while (true) {
           String book = scanner.nextLine();


            if (book.equals(bookName)) {
                System.out.printf("You checked %d books and found it.", count);
                break;
            } else if (book.equals("No More Books")) {
                System.out.printf("The book you search is not here!%n");
                System.out.printf("You checked %d books.", count);
                break;
            }
            count++;
        }

    }
}
