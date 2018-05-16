package nordicmotorhomes.project.Repositories;

import nordicmotorhomes.project.Model.Employee;
import nordicmotorhomes.project.Repositories.Util.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeRepository implements ICrudRepository<Employee>{


    private Connection conn;
    private PreparedStatement preparedStatement;
    private ResultSet result;

    public EmployeeRepository(){this.conn = DbConnection.getConnection();}

    @Override
    public ArrayList<Employee> readAll() {
        ArrayList<Employee> employees = new ArrayList<>();
        try {
            preparedStatement = conn.prepareStatement("SELECT * FROM employees");
            result = preparedStatement.executeQuery();

            while (result.next()) {
                employees.add(new Employee(result.getInt("id"), result.getString("Username"), result.getString("Password"), result.getString("FirstName"), result.getString("LastName"), result.getString("Position")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }

    @Override
    public Employee read(int id) {

        return null;
    }

    @Override
    public void create(Employee obj) {

    }

    @Override
    public void update(Employee obj) {

    }

    @Override
    public void delete(Employee obj) {

    }
}
