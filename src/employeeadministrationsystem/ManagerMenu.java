package employeeadministrationsystem;

import java.util.Scanner;

/**
 *
 * @author Mateus Manhani
 */
public class ManagerMenu {
    
    
    public static void start(Manager manager){
        Scanner scanner = new Scanner(System.in);
        
        //Manager login
        System.out.println("Welcome to the Manager Console Menu");
        if (manager != null && manager.isAuthenticated()){
            // if login successful, display menu
            displayMenu(scanner);
        }else {
            System.out.println("Invalid username or password. Exiting...");
        }
    }
    
    private static void displayMenu(Scanner scanner){
        //Display menu options
        System.out.println("\nMenu:");
        System.out.println("1. View current Staff");
        System.out.println("2. Add new staff");
        System.out.println("3. Exit");
        System.out.println("Enter your choice: ");
        
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                //View current staff
                break;
            case 2:
                // add new staff
                break;
            case 3:
                //exit
                break;
            default:
                break;
        }
    }
}
