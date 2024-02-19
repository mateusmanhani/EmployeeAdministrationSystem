
package employeeadministrationsystem;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Mateus Manhani
 */
public class Company {
    private String companyName;
    private HashSet<Employee> staffSet;
    
    // Default constractor that initializes all fields
    public Company(){
        this.companyName = "Name Example";
        this.staffSet = new HashSet<Employee>();
    }
    
    // Overloaded constructor
    public Company(String name){
        this.companyName = name;
        this.staffSet = new HashSet<Employee>();
    }
    
    // add staff method
    public void addNewStaff(Employee newEmp){
        staffSet.add(newEmp);
    }
    
    // get number of employees
    public int getStaffNumber(){
        return staffSet.size();
    }
    
    // method to list all employee numbers with an employee number above a value given as parameter
    public void listEmployees(int empNumThreshold){
        Iterator<Employee> iterator = staffSet.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if ( employee.getEmpNum() > empNumThreshold){
                System.out.println(employee.getName());
            }
        }
    }
}
