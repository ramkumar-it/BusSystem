package com.management;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketBookingManagement {

    // Dummy data for demonstration purposes
    private static List<String> bookedTickets = new ArrayList<>();

    public static void main(String[] args) {
        displayTicketBookingMenu();
    }

    public static void displayTicketBookingMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== Ticket Booking Menu ====");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Booked Tickets");
            System.out.println("3. Back to User Dashboard");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookTicket();
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

    public static void bookTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Book Ticket ====");
        System.out.print("Enter the route: ");
        String route = scanner.nextLine();

        System.out.print("Enter the departure time: ");
        String departureTime = scanner.nextLine();

        // Concatenate route and departure time to form a ticket
        String bookedTicket = "Ticket: " + route + " - Departure Time: " + departureTime;

        // Add the booked ticket to the list (in-memory representation, replace with database logic)
        bookedTickets.add(bookedTicket);

        System.out.println("Ticket booked successfully: " + bookedTicket);
    }

    public static void viewBookedTickets() {
        System.out.println("==== View Booked Tickets ====");
        if (bookedTickets.isEmpty()) {
            System.out.println("No booked tickets available.");
        } else {
            System.out.println("List of Booked Tickets:");
            for (String bookedTicket : bookedTickets) {
                System.out.println(bookedTicket);
            }
        }
    }
}

