import cards.Card_Holder;
import dbconn.DatabaseConnection;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Card_creator {

    public static void main(String[] args) {
        boolean power = true;
        Scanner inputScan = new Scanner(System.in);

        // Erstellen Sie eine Instanz der DatabaseConnection-Klasse
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.createTable();

        while (power) {
            System.out.println("Was wollen Sie spielen: \n [END] \n [DRINKGAME]");
            String userInput = inputScan.next();

            if (Objects.equals(userInput, "END")) {
                power = false;
                dbConnection.close();
                System.out.println("Goodbye!");
            }

            if (Objects.equals(userInput, "DRINKGAME")) {
                boolean mode = true;

                while (mode) {
                    System.out.println("Beenden[END] Spielen[ENTER]");
                    String play = inputScan.nextLine(); // Verwenden Sie nextLine() für die Eingabe

                    if (play.isEmpty()) { // Überprüfen Sie, ob die Eingabe leer ist (ENTER)
                        Random rand = new Random();
                        int i = rand.nextInt(20); // Generiert eine Zufallszahl zwischen 0 und 19

                        // Hole die Nachricht basierend auf der Zufallszahl
                        String message = Card_Holder.getCardMessage(i);

                        // Gib die Nachricht aus
                        System.out.println(message);
                    } else if (Objects.equals(play, "END")) {
                        mode = false;
                    }
                }
            }
        }
    }
}