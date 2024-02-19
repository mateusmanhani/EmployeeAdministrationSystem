package employeeadministrationsystem;

/**
 *
 * @author Mateus
 */
public class Manager extends Employee {
    private String username;
    private String password;
    
    // Constructor
    public Manager(String name, String email, String username,String password){
        super(name,email); // Call superclass constructor with name and email
        this.username = username;
        this.password = password;        
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    // ToString method for debugging
    @Override
    public String toString() {
        return "Manager{" +
            "name='" + getName() + '\'' +
            ", email='" + getEmail() + '\'' +
            ", empNum=" + getEmpNum() +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            '}';
}
    
}
