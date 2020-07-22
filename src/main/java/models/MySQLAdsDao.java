package models;

import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        //Array list to store ads into
        List<Ad> ads = new ArrayList<>();
        //Query that will get all ads from ads table in adlister_db
        String selectAds = "SELECT * FROM ads";
        try {
            //creating statement instance
            Statement stmt = connection.createStatement();
            //executing statement and storing in result set
            ResultSet rs = stmt.executeQuery(selectAds);
            //while rs.next is true (returns true until there are now more rows to go through) a new ad will be created
            while (rs.next()) {
                ads.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description"))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ads;
    }

//    @Override
//    public List<Ad> all() {
//        //Array list to store ads into
//        List<Ad> allAdAdsList = new ArrayList<>();
//        //Query that will get all ads from ads table in adlister_db
//        String getAllQuery = "SELECT * FROM ads";
//        try {
//            //creating statement instance
//            Statement statement = connection.createStatement();
//            //executing statement and storing in result set
//            ResultSet rs = statement.executeQuery(getAllQuery);
//            //while rs.next is true (returns true until there are now more rows to go through) a new ad will be created
//            while (rs.next()) {
//                allAdAdsList.add(new Ad(
//                        rs.getLong("id"),
//                        rs.getLong("user_id"),
//                        rs.getString("title"),
//                        rs.getString("description"))
//                );
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return allAdAdsList;
//    }

    @Override
    public Long insert(Ad ad) {
        long lastInsertedAdId = 0;
        String insertQuery = String.format("INSERT INTO ads (user_id, title, description) VALUES (%d,'%s','%s')",
                ad.getUserId(),
                ad.getTitle(),
                ad.getDescription()
        );

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                lastInsertedAdId = rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lastInsertedAdId;
    }


//    @Override
//    public Long insert(Ad ad) {
//        long insertedAdId = 0;
//        String insertQuery = String.format("INSERT INTO ads (user_id, title, description) VALUES ('%d','%s','%s')",
//                ad.getUserId(),
//                ad.getTitle(),
//                ad.getDescription()
//        );
//
//        try {
//            Statement statement = connection.createStatement();
//            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rsGenKeys = statement.getGeneratedKeys();
//            if (rsGenKeys.next()) {
//                insertedAdId = rsGenKeys.getLong(1);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return insertedAdId;
//    }

    public static void main(String[] args){
            MySQLAdsDao adsDao = new MySQLAdsDao(new Config());
//        System.out.println(adsDao.all());
        Ad testAd = new Ad(1, "test ad title", "test ad description");
        System.out.println(adsDao.insert(testAd)); //shows a new add number 6
    }

}

