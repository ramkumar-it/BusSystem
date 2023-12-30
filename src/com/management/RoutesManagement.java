package com.management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoutesManagement {

    // Dummy data for demonstration purposes
    private static List<String> routes = new ArrayList<>();

    public static void main(String[] args) {
        displayRoutesMenu();
    }

    public static void displayRoutesMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== Routes Management Menu ====");
            System.out.println("1. Add New Route");
            System.out.println("2. View Routes");
            System.out.println("3. Back to Admin Dashboard");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNewRoute();
                    break;
                case 2:
                    viewRoutes();
                    break;
                case 3:
                    // Return to the admin dashboard
                    // For example: AdminDashboardManagement.displayAdminDashboard();
                    return;
                case 4:
                    System.out.println("Exiting. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addNewRoute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Add New Route ====");
        System.out.print("Enter the origin: ");
        String origin = scanner.nextLine();

        System.out.print("Enter the destination: ");
        String destination = scanner.nextLine();

        // Concatenate origin and destination to form a route
        String newRoute = origin + " to " + destination;

        // Add the route to the list (in-memory representation, replace with database logic)
        routes.add(newRoute);

        System.out.println("New route added successfully: " + newRoute);
    }

    public static void viewRoutes() {
        System.out.println("==== View Routes ====");
        if (routes.isEmpty()) {
            System.out.println("No routes available.");
        } else {
            System.out.println("List of Routes:");
            for (String route : routes) {
                System.out.println(route);
            }
        }
    }
}
