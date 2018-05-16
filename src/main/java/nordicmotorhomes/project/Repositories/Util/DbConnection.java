package nordicmotorhomes.project.Repositories.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private final static String USERNAME = "nordicmotorhomes";
    private final static String PASSWORD = "Sm425~Y1?pX4";
    private final static String CONNSTRING = "jdbc:mysql://den1.mysql3.gear.host/nordicmotorhomes?useSSL=false";

    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(CONNSTRING, USERNAME, PASSWORD);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

}
