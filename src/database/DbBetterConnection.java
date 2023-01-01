package database;

import com.mysql.cj.jdbc.result.ResultSetFactory;
import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class DbBetterConnection {
    public static final String DB_URL = "jdbc:mysql://localhost/hr";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD="12345";

    public static void main(String[] args)  {
        Connection connection=null;
        try {
            connection= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            //Statement st= connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Statement st= connection.createStatement();
            // ResultSet yukaridaki parametreleri data.first() methodunu calismasi icin gerekli
            String query="SELECT * FROM countries";

            ResultSet data=st.executeQuery(query);
            while(data.next()){
                //System.out.println(data.first());
                //data.absolute(3);
                System.out.println("ID:"+data.getString("country_id") + " Country : " + data.getString("country_name"));
                //System.out.println(data.last());
                System.out.println("ID:"+data.getString("country_id") + " Country : " + data.getString("country_name"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally{
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        String insertSQL="INSERT INTO countries (country_id,country_name, region_id)" +
                " VALUES('AL','AlperLand', 2)";
        try {
            connection= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement st= connection.createStatement();
            System.out.println(st.executeUpdate(insertSQL));
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

