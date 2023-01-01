package database;

import java.sql.*;

public class DBDelete {
    public static final String DB_URL = "jdbc:mysql://localhost/hr";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD="12345";

    public static void main(String[] args) {
        Connection connection=null;

        String stSql="DELETE FROM countries WHERE country_id='AP'";
        String psSql="DELETE FROM countries WHERE country_id=?";

        try {
            connection= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement st= connection.createStatement();
            st.executeUpdate(stSql);

            PreparedStatement ps= connection.prepareStatement(psSql);
            ps.setString(1,"AL");
            ps.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
