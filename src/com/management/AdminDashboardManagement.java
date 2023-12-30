package com.management;

	import java.util.Scanner;

	public class AdminDashboardManagement {

	    public static void main(String[] args) {
	        displayAdminDashboard();
	    }

	    public static void displayAdminDashboard() {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("==== Admin Dashboard ====");
	            System.out.println("1. View Booked Tickets");
	            System.out.println("2. Cancel Ticket");
	            System.out.println("3. Logout");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    viewBookedTickets();
	                    break;
	                case 2:
	                    cancelTicket();
	                    break;
	                case 3:
	                    System.out.println("Logging out. Goodbye!");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    public static void viewBookedTickets() {
	        // Logic to fetch and display booked tickets from the database
	        System.out.println("==== View Booked Tickets ====");
	        // Fetch and display booked tickets
	    }

	    public static void cancelTicket() {
	        // Logic to cancel a booked ticket in the database
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("==== Cancel Ticket ====");
	        System.out.print("Enter the ticket ID to cancel: ");
	        int ticketId = scanner.nextInt();

	        // Call a method to cancel the ticket
	        boolean isCanceled = cancelTicketInDatabase(ticketId);

	        if (isCanceled) {
	            System.out.println("Ticket canceled successfully.");
	        } else {
	            System.out.println("Ticket cancellation failed. Please try again.");
	        }
	    }

	    // Dummy method for canceling a ticket in the database
	    private static boolean cancelTicketInDatabase(int ticketId) {
	        // Actual logic to cancel a ticket in the database goes here
	        // Return true if cancellation is successful, false otherwise
	        return true;
	    }
	}

