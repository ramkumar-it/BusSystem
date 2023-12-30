package com.management;
import java.util.Scanner;

public class LoginManagement {

    public static void main(String[] args) {
        displayLoginMenu();
    }

    public static void displayLoginMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== Login Menu ====");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    System.out.println("Exiting. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Login ====");
        System.out.print("Enter your username: ");
        String username = scanner.next();

        System.out.print("Enter your password: ");
        String password = scanner.next();

        // Call a method to authenticate the user
        boolean isAuthenticated = authenticateUser(username, password);

        if (isAuthenticated) {
            System.out.println("Login successful. Welcome, " + username + "!");
            // Call a method to redirect to the user's dashboard
            // For example: UserDashboardManagement.displayUserDashboard(username);
        } else {
            System.out.println("Login failed. Please check your credentials and try again.");
        }
    }

    public static void register() {
        // Logic for user registration goes here
        System.out.println("==== Register ====");
        // Implement user registration functionality
    }

    // Dummy method for user authentication
    private static boolean authenticateUser(String username, String password) {
        // Actual logic to authenticate the user goes here
        // Return true if authentication is successful, false otherwise
        return username.equals("testuser") && password.equals("password123");
    }
}



