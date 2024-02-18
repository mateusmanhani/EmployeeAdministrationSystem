package employeeadministrationsystem;

import java.util.Scanner;

/**
 *
 * @author Mateus Manhani
 */
public class ManagerMenu {
    private static final String MANAGER_USERNAME = "Gnomeo"; //valid username to give access
    private static final String MANAGER_PASSWORD = "smurf"; // valid password to give access
    
    public static void start(){
        Scanner scanner = new Scanner(System.in);
        
        //Manager login
        System.out.println("");
    }
    
    private static boolean isValidManager(Scanner scanner){
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        return username.equals(MANAGER_USERNAME) && password.equals(MANAGER_PASSWORD);
    }
}
