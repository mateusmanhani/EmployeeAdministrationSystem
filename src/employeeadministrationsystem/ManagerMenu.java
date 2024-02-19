package employeeadministrationsystem;

import java.util.Scanner;

/**
 *
 * @author Mateus Manhani
 */
public class ManagerMenu {
    
    private static final String CORRECT_USERNAME = "Gnomeo"; //valid username to give access
    private static final String CORRECT_PASSWORD = "smurf"; // valid password to give access
    
    
    public static void start(Manager manager, Company company){
        Scanner scanner = new Scanner(System.in);
        
        //Manager login
        System.out.println("Welcome to the Manager Console Menu");
        if (manager != null && isAuthenticated(manager,CORRECT_USERNAME,CORRECT_PASSWORD)){
            // if login successful, display menu
            displayMenu(scanner, company);
        }else {
            System.out.println("Invalid username or password. Exiting...");
        }
    }
    
    private static void displayMenu(Scanner scanner, Company company){
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
                viewStaff(company);
                break;
            case 2:
                // Ask manager for input on the new employee to add to the staff
                System.out.println("Enter the new employee name: ");
                String newEmpName = scanner.nextLine();
                System.out.println("Enter the new employee email: ");
                String newEmpEmail = scanner.nextLine();
                //Instatiate new employee
                Employee newEmp = new Employee(newEmpName,newEmpEmail);
                // add new staff
                company.addNewStaff(newEmp);
                break;
            case 3:
                //exit
                break;
            default:
                break;
        }
    }
    
    public static void viewStaff(Company company){
        company.listEmployees(0);
    }
    
    public static boolean isAuthenticated(Manager manager, String correctUsername, String correctPassword){
        return manager.getUsername().equals(correctUsername) && manager.getPassword().equals(correctPassword);
    }
}
