
package employeeadministrationsystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Mateus Manhani
 */
public class Employee {
    private String name;
    private String email;
    private int empNum;
    private static int nextEmpNum = 1;
    
    // Constructor with parameter
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++; //auto increment empNum to have unique employee numbers
    }
    
    // Constructor with default values
    public Employee(){
        this.name = "John Doe";
        this.name = "john.doe@example.com";
        this.empNum = nextEmpNum++; //auto increment empNum to have unique employee numbers
    }
    
    // setter for email
    public void setEmail(String email){
        if (isValidEmail(email))    
        this.email = email;
    }
    
    // getter for current nextEmpNum
    public static int getNextEmpNum(){
        return nextEmpNum;
    }
    
    // getter for name
    public String getName(){
        return name;
    }
    // getter for email
    public String getEmail(){
        return email;
    }
    // getter for empNum
    public int getEmpNum(){
        return empNum;
    }
    
    // method to ensure email is valid usign regex
    private boolean isValidEmail(String email){
        // Recipient name regex
        String recipientNameRegex = "^[a-zA-Z0-9._%+-]{1,64}";
        // Domain name regex
        String domainNameRegex = "[a-zA-Z0-9.-]+\\.";
        // Top-level domain regex
        String topLevelDomainRegex = "[a-zA-Z]{2,}$";
        // Combine all parts to form the complete regex
        String emailRegex = recipientNameRegex + "@" + domainNameRegex + topLevelDomainRegex;
        
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    // toString() method to represent the object as a String
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", empNum=" + empNum +
                '}';
    }
    
}
