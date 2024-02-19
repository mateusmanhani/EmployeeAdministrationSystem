
package employeeadministrationsystem;

/**
 *
 * @author Mateus Manhani
 * GitHub repository: https://github.com/mateusmanhani/EmployeeAdministrationSystem
 */
public class EmployeeTest {

    public static void main(String[] args) {
        // declare and initialize projectGroup array for test employees
        Employee[] projectGroup  = new Employee[3];
        
        // Instatiate test Employee objects
        Employee empTest1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee empTest2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee empTest3 = new Employee("Tom Thumb", "tt@gmail.com");
        
        // Assign Employee objects to the projectGroup array
        projectGroup[0] = empTest1;
        projectGroup[1] = empTest2;
        projectGroup[2] = empTest3;
        
        System.out.println(Employee.getNextEmpNum());
//        System.out.println(empTest1);
//        System.out.println(empTest2);
//        System.out.println(empTest3);
        
        int m = 0;
        for (Employee emp : projectGroup){
            if (emp.getEmpNum() > m) {
                System.out.println(emp.getName());
            }
        }
        
        Manager manager1 = new Manager("mateus","mm@gamil.com","mateus1","1234");
        
        System.out.println(manager1);
    }
    
}
