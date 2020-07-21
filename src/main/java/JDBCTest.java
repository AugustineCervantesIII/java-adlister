import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class JDBCTest {

    private static List<String> getEmployeeFirstNames() {
        List<String> names = new ArrayList<>();

            try {
                DriverManager.registerDriver(new Driver());
                Connection connect = DriverManager.getConnection(
                        "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
                        "root",
                        "codeup"
                );

                Statement statement = connect.createStatement();
                ResultSet rs = statement.executeQuery("SELECT first_name FROM employees.employees LIMIT 5");

                while (rs.next()) {
                    names.add(rs.getString("first_name"));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return names;
        }

    public static List<String> getEmployeeNames(int numOfNames) {
        List<String> names = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT first_name FROM employees.employees LIMIT " + numOfNames);
            while(rs.next()) {
                names.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return names;
    }


    public static void main(String[] args) {
        System.out.println(getEmployeeFirstNames());
        System.out.println(getEmployeeNames(3));
    }

}