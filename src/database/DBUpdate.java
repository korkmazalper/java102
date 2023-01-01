package database;

import java.sql.*;

public class DBUpdate {
    public static final String DB_URL = "jdbc:mysql://localhost/hr";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD="12345";
    public static void main(String[] args) {
        Connection connection=null;

        String stSql="UPDATE countries SET country_id='AP' WHERE country_id='1'";
        String psSql="UPDATE countries SET country_name=? WHERE country_id=?";

        try {
            connection= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            //yöntem 1
            //Statement st= connection.createStatement();
            //System.out.println(st.executeUpdate(stSql));
            // yöntem 2
            PreparedStatement pr=connection.prepareStatement(psSql);
            pr.setString(2,"AP");
            pr.setString(1,"ALPTuschland");
            pr.executeUpdate();


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
