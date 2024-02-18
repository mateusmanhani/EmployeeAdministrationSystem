
package employeeadministrationsystem;

import java.util.ArrayList;

/**
 *
 * @author Mateus Manhani
 */
public class Company {
    private String companyName;
    private ArrayList<Employee> staff;
    
    // Default constractor that initializes all fields
    public Company(){
        this.companyName = "Name Example";
        this.staff = new ArrayList<Employee>();
    }
    
    // Overloaded constructor
    public Company(String name){
        this.companyName = name;
        this.staff = new ArrayList<Employee>();
    }
    
}
