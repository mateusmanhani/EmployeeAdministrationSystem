
package employeeadministrationsystem;

import java.util.ArrayList;
import java.util.Iterator;

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
    
    // add staff method
    public void addNewStaff(Employee newEmp){
        staff.add(newEmp);
    }
    
    // get number of employees
    public int getStaffNumber(){
        return staff.size();
    }
    
    // method to list all employee numbers with an employee number above a value given as parameter
    public void listEmployees(int empNumThreshold){
        Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if ( employee.getEmpNum() > empNumThreshold){
                System.out.println(employee.getName());
            }
        }
    }
}
