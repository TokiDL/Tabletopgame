import cards.Card_Holder;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Random;

public class Card_creator {

    public static class Databaseconnection {
        static final String driver = "org.mariadb.jdbc.Driver"; // Aktualisierter Treibername
        static final String url = "jdbc:mariadb://localhost:3306/tabletop";

        static final String user = "root";
        static final String pass = "";
    }

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            Class.forName(Databaseconnection.driver); // Verwende den aktualisierten Treibernamen
            System.out.println("Connection to database....");
            conn = DriverManager.getConnection(Databaseconnection.url, Databaseconnection.user, Databaseconnection.pass);

            //Hier wenn du Database erstellen willst
            System.out.println("Datenbank update...");
            st = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS Spieler (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(100) NOT NULL, " +
                    "age INT" +
                    ")";
            st.executeUpdate(sql);
            System.out.println("Datenbank Update erfolgreich");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null)
                    st.close();
            } catch (SQLException e1) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("Goodbye!");

        Random rand = new Random();
        int i = rand.nextInt(20); // Generiert eine Zufallszahl zwischen 0 und 19

        // Hole die Nachricht basierend auf der Zufallszahl
        String message = Card_Holder.getCardMessage(i);

        // Gib die Nachricht aus
        System.out.println(message);
    }//end main
}