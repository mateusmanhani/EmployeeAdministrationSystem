package employeeadministrationsystem;

import java.util.Scanner;

/**
 *
 * @author Mateus Manhani
 */
public class ManagerMenu {
    
    private static final String CORRECT_USERNAME = "Gnomeo"; //valid username to give access
    private static final String CORRECT_PASSWORD = "smurf"; // valid password to give access
    
    
    public static void start(Manager manager){
        Scanner scanner = new Scanner(System.in);
        
        //Manager login
        System.out.println("Welcome to the Manager Console Menu");
        if (manager != null && isAuthenticated(manager,CORRECT_USERNAME,CORRECT_PASSWORD)){
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
    
    public static boolean isAuthenticated(Manager manager, String correctUsername, String correctPassword){
        return manager.getUsername().equals(correctUsername) && manager.getPassword().equals(correctPassword);
    }
}
