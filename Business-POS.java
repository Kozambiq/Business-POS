/* Hello, this is my first project that I made, if you guys have any suggestions leave it in a comment, TY*/

import java.util.Scanner;

public class BusinessPOS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

        String[] products = {"Milk", "Coffee", "Tea", "Juice", "Pizza"};
        Double[] prices = {10.0, 14.0, 8.0, 10.0, 15.0};
        int choice;
        int quantity;
        double total;

        System.out.println("\n ====Business POS====");
        System.out.println("Available Products: ");

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - $" + prices[i]);
        }

        System.out.print("Enter your desired product(1-5) (0 to return): ");0
        if (choice == 0) {
            System.out.println("Program stopped by user");
            scanner.close();
            return;
        }

        if (choice < 0 || choice > products.length) {
            System.out.println("Invalid Choice Of Product!");
            continue;
        }

        System.out.print("How many " + products[index] + " would you like?: ");
        quantity = scanner.nextInt();


        total = quantity * prices[index];

        System.out.println("You bought " + quantity + " " + products[index] + " with a total of $" + total);

        }
    }
}
