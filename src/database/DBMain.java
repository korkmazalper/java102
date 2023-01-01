package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBMain {
    public static void main(String[] args) {
        Connection connect= null;
        String url="jdbc:mysql://localhost/hr?user=root&password=12345";

        try {
            connect= DriverManager.getConnection(url);
            System.out.println("DB Connected");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
