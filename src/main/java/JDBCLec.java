import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class JDBCLec {

    public static void main(String[] args) {
        try {

            DriverManager.registerDriver(new Driver());

            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );

            Statement statement = connect.createStatement();

//            String query = "SELECT * FROM albums";
//
//            ResultSet rs = statement.executeQuery(query);

//            rs.next();
//
//            System.out.println(rs.getString(1));
//            System.out.println(rs.getString(2));
//            System.out.println(rs.getString(3));
//            System.out.println(rs.getString(4));
//            System.out.println(rs.getString(5));
//            System.out.println(rs.getString(6));
//
//            rs.beforeFirst(); //also rs.previous();
//
//            while (rs.next()){
//                System.out.println("============");
//                System.out.println(rs.getString("id"));
//                System.out.println(rs.getString("artist_name"));
//                System.out.println(rs.getString("record_name"));
//                System.out.println(rs.getString("release_date"));
//                System.out.println(rs.getString("sales"));
//                System.out.println(rs.getString("genre"));
//            }

            Album updateAlbum = new Album(
                    2,
                    "Prince",
                    "Purple Rain",
                    1984,
                    50,
                    "Amazing"
            );

            String updateQuery = String.format("Update albums SET artist_name = '%s', record_name = '%s', release_date = %d, sales = %f, genre = '%s' WHERE id = %d",
                    updateAlbum.getArtist(),
                    updateAlbum.getName(),
                    updateAlbum.getReleaseDate(),
                    updateAlbum.getSales(),
                    updateAlbum.getGenre(),
                    updateAlbum.getId()
                    );

            boolean returnResultSet = statement.execute(updateQuery);
            int numberOfRowsEffected = statement.executeUpdate(updateQuery); //recommended



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}