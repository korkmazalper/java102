package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementSample {
    public static final String DB_URL = "jdbc:mysql://localhost/hr";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD="12345";
    public static void main(String[] args) {
        Connection connection=null;
        String prepQuery="INSERT INTO countries (country_id,country_name, region_id)" +
                " VALUES(?,?,?)";
        try {
            connection= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            PreparedStatement preparedStatement=connection.prepareStatement(prepQuery);
            preparedStatement.setString(1,"DL");
            preparedStatement.setString(2,"Demetland");
            preparedStatement.setInt(3,2);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally{
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
