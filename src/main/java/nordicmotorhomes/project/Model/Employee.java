package nordicmotorhomes.project.Model;
//Albert-Madlin Turcu

//below the class Employee is created which is a model that helps us
// to work with informations about employees and give them
// the right to authenticate into application
public class Employee {

    private int employeeId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String position;

    // the next class represent the constructor which is the method
    // that is executed at the very beginning of the class instantiation

    public Employee(int employeeId, String username, String password, String firstName, String lastName, String position){
        this.employeeId = employeeId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //all of the methods from above are getters and setters that help us to work with the employee's data
}
