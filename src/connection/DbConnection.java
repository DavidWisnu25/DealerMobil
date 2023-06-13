package connection;

/**
 Kevin PK Wilson / A / 210711076
Gabriel David Wisnu Dewangga / A / 210711097
AG Arka Atmaja / A / 210711109
Axel Christian Nugroho / A / 210711114
*/

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    public static Connection CON;
    public static final String URL = "jdbc:mysql://";
    public static final String PATH = "localhost:3306/object-persistencetubes";

    
    public Connection makeConnection(){
        System.out.println("Opening database..");
        try {
            CON = DriverManager.getConnection(URL + PATH, "root", "");
            System.out.println("success!");
        } catch (Exception e) {
            System.out.println("Error opening database..");
            System.out.println(e);
        }
        
        return CON;
    }
    
    public void closeConnection() {
        System.out.println("Closing database..");
        try {
            CON.close();
            System.out.println("success!");
        } catch (Exception e) {
            System.out.println("Error closing database..");
            System.out.println(e);
        }
    }
}