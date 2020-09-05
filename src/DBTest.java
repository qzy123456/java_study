
import java.sql.*;

public class DBTest {
    private static final String USERNAME = "root";
    private static final String PASSWD = "root";
    private static final String DATABASE = "test";
    private static final String DBMS = "mysql";
    private static final String HOST = "localhost";
    private static final String PORT = "3306";
    private static final String DSN = "jdbc:" + DBMS + "://" + HOST + ":" + PORT + "/" + DATABASE;

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DSN, USERNAME, PASSWD);
            String query = "SELECT * FROM app";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

