package cards;

import java.util.Random;

public class Card_creator {

    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(20); // Generates a random number between 0 and 19

        switch(i) {
            case 0:
                System.out.println("Trinke 1 Shot!");
                break;
            case 1:
                System.out.println("Trinke 2 Shots!");
                break;
            case 2:
                System.out.println("Wähle eine Person aus, die trinken muss.");
                break;
            case 3:
                System.out.println("Alle mit Brille trinken!");
                break;
            case 4:
                System.out.println("Spiel eine Runde Schere, Stein, Papier. Der Verlierer trinkt!");
                break;
            case 5:
                System.out.println("Alle Jungs trinken!");
                break;
            case 6:
                System.out.println("Alle Mädels trinken!");
                break;
            case 7:
                System.out.println("Erzähle einen Witz. Wer nicht lacht, trinkt!");
                break;
            case 8:
                System.out.println("Mache 10 Liegestütze oder trinke 2 Shots!");
                break;
            case 9:
                System.out.println("Wähle eine Person aus, die mit dir trinkt.");
                break;
            case 10:
                System.out.println("Alle, die heute Geburtstag haben, trinken!");
                break;
            case 11:
                System.out.println("Trinke so viele Shots, wie du Buchstaben in deinem Vornamen hast!");
                break;
            case 12:
                System.out.println("Alle, die Sneaker tragen, trinken!");
                break;
            case 13:
                System.out.println("Erfinde eine neue Trinkregel. Wer sie bricht, trinkt!");
                break;
            case 14:
                System.out.println("Trinke, wenn du heute schon Kaffee getrunken hast!");
                break;
            case 15:
                System.out.println("Alle, die blond sind, trinken!");
                break;
            case 16:
                System.out.println("Wähle eine Person aus, die deinen nächsten Shot aussucht.");
                break;
            case 17:
                System.out.println("Trinke, wenn du heute schon etwas Gesundes gegessen hast!");
                break;
            case 18:
                System.out.println("Alle, die ein Haustier haben, trinken!");
                break;
            case 19:
                System.out.println("Trinke, wenn du heute schon Sport gemacht hast!");
                break;
            default:
                System.out.println("Sauf!");
                break;
        }
    }
}