package employeeadministrationsystem;

/**
 *
 * @author Mateus Manhani GitHub repository:
 * https://github.com/mateusmanhani/EmployeeAdministrationSystem
 */
public class EmployeeTest {

    public static void main(String[] args) {
        // declare and initialize projectGroup array for test employees
        Employee[] projectGroup = new Employee[3];

        // Instatiate test Employee objects
        Employee empTest1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee empTest2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee empTest3 = new Employee("Tom Thumb", "tt@gmail.com");

        // Assign Employee test objects to the projectGroup array
        projectGroup[0] = empTest1;
        projectGroup[1] = empTest2;
        projectGroup[2] = empTest3;

        // Print current employee number after instantiating test employees
        System.out.println(Employee.getNextEmpNum());

        // iterate through projectGroup array and print employee names whose employee number is higher then 'm'
        int m = 0;
        for (Employee emp : projectGroup) {
            if (emp.getEmpNum() > m) {
                System.out.println(emp.getName());
            }
        }

        // instantiate manager
        Manager manager1 = new Manager("mateus", "mm@gmail.com", "mateus1", "1234");

        // Instantiate company
        Company company1 = new Company("Business Gnomes ltd.");

        // Add test employees to company to test functionality
//        company1.addNewStaff(empTest1);
//        company1.addNewStaff(empTest2);
//        company1.addNewStaff(empTest3);
//        company1.addNewStaff(manager1);
        // Change username and password of manager one to test functionality of manager class and manager menu
        manager1.setPassword("smurf");
        manager1.setUsername("Gnomeo");

        // Call the method that starts the manager menu
        ManagerMenu.startMenu(manager1, company1);
    }

}
