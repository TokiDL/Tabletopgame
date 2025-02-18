package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private static final String DRIVER = "org.mariadb.jdbc.Driver"; // Aktualisierter Treibername
    private static final String URL = "jdbc:mariadb://localhost:3306/tabletop";
    private static final String USER = "root";
    private static final String PASS = "";

    private Connection connection;
    private Statement statement;

    public DatabaseConnection() {
        try {
            Class.forName(DRIVER);
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(URL, USER, PASS);
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTable() {
        try {
            System.out.println("Updating database...");
            String sql = "CREATE TABLE IF NOT EXISTS Games (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(100) NOT NULL, " +
                    "age INT" +
                    ")";
            statement.executeUpdate(sql);
            System.out.println("Database update successful");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
            System.out.println("Database connection closed.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}