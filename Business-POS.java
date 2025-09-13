/* Hello, this is my first project that I made, if you guys have any suggestions leave it in a comment, TY
Added try and catch*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class BusinessPOS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"Milk", "Coffee", "Juice", "Pizza", "Spaghetti"};
        double[] prices = {2.50, 3.00, 2.00, 12.00, 18.00};

        int choice;
        int quantity = 0;
        double total = 0.0;

            while (true) {

                System.out.println("\n===Business POS====");
                System.out.println("Availabe products:");

                for (int i = 0; i < products.length; i++) {
                    System.out.printf("%d. %s - $%.2f\n", (i + 1), products[i], prices[i]);
                }
                System.out.println("0. Checkout");

                try {
                    System.out.print("Input what product you want: ");
                    choice = scanner.nextInt();
                    int index = choice - 1;

                    if (choice == 0) {
                        break;
                    }

                    if (choice < 0 || choice > products.length) {
                        System.out.printf("Product choice must be between 1 to %s\n", products.length);
                        continue;
                    }

                    try {
                        System.out.printf("How many %s would you want?: ", products[index]);
                        quantity = scanner.nextInt();

                    } catch (InputMismatchException e) {
                        System.out.println("Using numbers is the only way to choose product quantity!");
                        scanner.nextLine();
                        continue;
                    }

                    total += quantity * prices[index];

                } catch (InputMismatchException e) {
                    System.out.println("You can only use numbers when choosing how much you want!");
                    scanner.nextLine();
                    continue;
                }
            }
        System.out.println("\n====================================");
        System.out.printf("Your Subtotal is $%.1f\n", total);
        System.out.println("Thanks for shopping with us!");
        scanner.close();
    }
}
