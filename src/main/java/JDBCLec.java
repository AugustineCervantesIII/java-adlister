import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import models.Album;

public class JDBCLec {

    public static void main(String[] args) {
        try {

            // ======================== CREATING THE DRIVER and CONNECTION OBJECTS

            DriverManager.registerDriver(new Driver());

            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );

            // ======================== CREATING A STATEMENT OBJECT

            Statement statement = connect.createStatement();

            // ======================== GETTING A SINGLE AND LIST OF RESULTS

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

            // ======================== GETTING METADATA

            //            ResultSetMetaData rsmd = rs.getMetaData();
//            int colCount = rsmd.getColumnCount();
//            for (int i = 1; i <= colCount; i += 1) {
//                System.out.println(rsmd.getColumnName(i));
//            }

            // ======================== ALBUM MODEL

            //            rs.beforeFirst();
//            rs.next();

//            models.Album album = new models.Album(rs.getLong("id"),
//                rs.getString("artist"),
//                rs.getString("name"),
//                rs.getInt("release_date"),
//                rs.getDouble("sales"),
//                rs.getString("genre")
//            );
//
//            System.out.println(album);
//            System.out.println(album.getId());
//            System.out.println(album.getArtist());
//            System.out.println(album.getName());
//            System.out.println(album.getReleaseDate());
//            System.out.println(album.getSales());
//            System.out.println(album.getGenre());

            // ======================== UPDATE A RECORD

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

//            boolean returnResultSet = statement.execute(updateQuery);
//            int numberOfRowsEffected = statement.executeUpdate(updateQuery); //recommended

            // ======================== INSERTING A RECORD

//            models.Album brandNewAlbum = new models.Album(
//                "The Cure",
//                "Disintegration",
//                1989,
//                15,
//                "alt, goth, rock"
//            );
//
//            String insertQuery = String.format("INSERT INTO albums (artist, name, release_date, sales, genre) VALUES ('%s', '%s', %d, %f, '%s')",
//                brandNewAlbum.getArtist(),
//                brandNewAlbum.getName(),
//                brandNewAlbum.getReleaseDate(),
//                brandNewAlbum.getSales(),
//                brandNewAlbum.getGenre()
//            );
//
//            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = statement.getGeneratedKeys();
//
//            if (rs.next()) {
//                System.out.println("Inserted id is: " + rs.getLong(1));
//            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}