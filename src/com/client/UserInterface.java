package com.client;


	import java.util.Scanner;
	import com.management.*;
import com.service.UserService;

	public class UserInterface {


		public static void main(String[] args) {
	        displayAdminDashboard();
	    }

	    public static void displayAdminDashboard() {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("==== Admin Dashboard ====");
	            System.out.println("1. User");
	            System.out.println("2. Manage Schedules");
	            System.out.println("3. Generate Reports");
	            System.out.println("4. Manage Users");
	            System.out.println("5. Ticket Cancellation");
	            System.out.println("6. Logout");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                	int choice1=0;
	                	System.out.println("1. login\n2. Registration\nEnter your choice:");
	                	choice1=scanner.nextInt();
	                	switch (choice1){
	                		case 1:
	                			System.out.println("Enter your User id");
	                			scanner.nextLine();
	                			String userId = scanner.nextLine();
	                			System.out.println("Enter your password");
	                			String password= scanner.next();
	                			boolean bool = new UserService().checkUser(userId,password );
	                			if(bool) {
	                				System.out.println("1.show bus details\n2. book a reservtion\n3. cancel a reservation");
	                			}
	                			else {
	                				System.out.println("Your userid or password is invalid");
	                			}
	                			break;
	                		case 2:
	                			System.out.println("Enter user details to register");
	                			
//	                			username:age:
	                			String details = scanner.next();
	                	}
	                    break;
	                case 2:
	                    ScheduleManagement.displayScheduleMenu();
	                    break;
	                case 3:
	                    ReportingManagement.displayReportingMenu();
	                    break;
//	                case 4:
//	                    UserManagement.displayUserManagementMenu();
//	                    break;
	                case 4:
	                    TicketCancellationManagement.displayTicketCancellationMenu();
	                    break;
	                case 5:
	                    System.out.println("Logging out. Goodbye!");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}

