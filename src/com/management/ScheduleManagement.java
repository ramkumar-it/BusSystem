package com.management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScheduleManagement {

    // Dummy data for demonstration purposes
    private static List<String> schedules = new ArrayList<>();

    public static void main(String[] args) {
        displayScheduleMenu();
    }

    public static void displayScheduleMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== Schedule Management Menu ====");
            System.out.println("1. Add New Schedule");
            System.out.println("2. View Schedules");
            System.out.println("3. Back to Admin Dashboard");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNewSchedule();
                    break;
                case 2:
                    viewSchedules();
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

    public static void addNewSchedule() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Add New Schedule ====");
        System.out.print("Enter the route: ");
        String route = scanner.nextLine();

        System.out.print("Enter the departure time: ");
        String departureTime = scanner.nextLine();

        // Concatenate route and departure time to form a schedule
        String newSchedule = route + " - Departure Time: " + departureTime;

        // Add the schedule to the list (in-memory representation, replace with database logic)
        schedules.add(newSchedule);

        System.out.println("New schedule added successfully: " + newSchedule);
    }

    public static void viewSchedules() {
        System.out.println("==== View Schedules ====");
        if (schedules.isEmpty()) {
            System.out.println("No schedules available.");
        } else {
            System.out.println("List of Schedules:");
            for (String schedule : schedules) {
                System.out.println(schedule);
            }
        }
    }
}
