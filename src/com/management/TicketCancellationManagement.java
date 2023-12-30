package com.management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketCancellationManagement {

    // Dummy data for demonstration purposes
    private static List<String> bookedTickets = new ArrayList<>();

    public static void main(String[] args) {
        displayTicketCancellationMenu();
    }

    public static void displayTicketCancellationMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== Ticket Cancellation Menu ====");
            System.out.println("1. Cancel Ticket");
            System.out.println("2. View Booked Tickets");
            System.out.println("3. Back to User Dashboard");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cancelTicket();
                    break;
                case 2:
                    viewBookedTickets();
                    break;
                case 3:
                    // Return to the user dashboard
                    // For example: UserDashboardManagement.displayUserDashboard(username);
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

    public static void cancelTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Cancel Ticket ====");
        System.out.print("Enter the ticket number to cancel: ");
        int ticketNumber = scanner.nextInt();

        // Check if the ticket number is valid
        if (ticketNumber >= 1 && ticketNumber <= bookedTickets.size()) {
            // Remove the canceled ticket from the list (in-memory representation, replace with database logic)
            String canceledTicket = bookedTickets.remove(ticketNumber - 1);
            System.out.println("Ticket canceled successfully: " + canceledTicket);
        } else {
            System.out.println("Invalid ticket number. Please try again.");
        }
    }

    public static void viewBookedTickets() {
        System.out.println("==== View Booked Tickets ====");
        if (bookedTickets.isEmpty()) {
            System.out.println("No booked tickets available.");
        } else {
            System.out.println("List of Booked Tickets:");
            for (int i = 0; i < bookedTickets.size(); i++) {
                System.out.println((i + 1) + ". " + bookedTickets.get(i));
            }
        }
    }
}
