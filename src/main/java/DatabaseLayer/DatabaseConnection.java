package DatabaseLayer;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private final String url = "jdbc:mysql://localhost:3306/carcare_db";
    private final String username = "root";
    private final String password = "";
    public static DatabaseConnection instance;

    private Connection connection;
    private DatabaseConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connection Success!");
        }catch (ClassNotFoundException ex){
            System.out.println("Driver Class Error! " + ex.getMessage());
        }catch (SQLException ex2){
            System.out.println("Database Connection Error! " + ex2.getMessage());
        }
    }

    public static DatabaseConnection getSingleInstance(){
        try{
            if(instance == null){
                instance = new DatabaseConnection();
            }else if(instance.connection.isClosed()){
                instance = new DatabaseConnection();
            }else{
                System.out.println("Connection is already there!");
                return instance;
            }
            return instance;
        }catch (SQLException sqlex){
            System.out.println("Database Connection Error! " + sqlex.getMessage());
            return null;
        }
    }

    public boolean ExecuteQuery(String sqlQ){
        try{
            Statement statement =  connection.createStatement();
            int result = statement.executeUpdate(sqlQ);
            return result > 0;
        }catch (SQLException ex){
            System.out.println("SQL Error " + ex.getMessage());
            return false;
        }
    }


}
