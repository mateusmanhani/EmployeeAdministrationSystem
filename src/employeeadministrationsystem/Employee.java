
package employeeadministrationsystem;

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
        this.email = email;
    }
    
    // getter for current nextEmpNum
    public int getNextEmpNum(){
        return nextEmpNum;
    }
    
    
}
