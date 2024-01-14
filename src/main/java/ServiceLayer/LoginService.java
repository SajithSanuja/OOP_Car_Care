package ServiceLayer;

import DatabaseLayer.DatabaseConnection;

public class LoginService {
    private DatabaseConnection singleConnetion;
    public LoginService(){
        singleConnetion = DatabaseConnection.getSingleInstance();
    }
    public boolean
}
