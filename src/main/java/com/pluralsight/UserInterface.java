package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
     Scanner scanner = new Scanner(System.in);
     Order currentOrder = new Order();

    public void displayHome() {
        boolean running = true;

        while (running) {
            System.out.println("\n=== 🍛 JOLLOF EXPRESS MENU ===");
            System.out.println("1.New Order");
            System.out.println("0.Exit");
            System.out.print("Enter choice:");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // startNewOrder();
                    break;
                case "0":
                    System.out.println("Goodbye! 👋");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
private void startNewOrder(Scanner scanner) {

    boolean ordering = true;
    while (ordering) {
        System.out.println("\n--- ORDER MENU ---");
        System.out.println("1. Add Jollof Meal");
        System.out.println("2. Add Drink");
        System.out.println("3. Add Side");
        System.out.println("4. Checkout");
        System.out.println("0. Cancel Order");
        System.out.print("Choose an option: ");
        String choice = scanner.nextLine();
    }
}

