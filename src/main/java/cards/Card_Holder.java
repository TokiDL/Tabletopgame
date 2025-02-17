package cards;

public class Card_Holder {

    // Methode, die die Nachricht basierend auf der Zufallszahl zurückgibt
    public static String getCardMessage(int cardNumber) {
        switch (cardNumber) {
            case 0:
                return "Trinke 1 Shot!";
            case 1:
                return "Trinke 2 Shots!";
            case 2:
                return "Wähle eine Person aus, die trinken muss.";
            case 3:
                return "Alle mit Brille trinken!";
            case 4:
                return "Spiel eine Runde Schere, Stein, Papier. Der Verlierer trinkt!";
            case 5:
                return "Alle Jungs trinken!";
            case 6:
                return "Alle Mädels trinken!";
            case 7:
                return "Erzähle einen Witz. Wer nicht lacht, trinkt!";
            case 8:
                return "Mache 10 Liegestütze oder trinke 2 Shots!";
            case 9:
                return "Wähle eine Person aus, die mit dir trinkt.";
            case 10:
                return "Alle, die heute Geburtstag haben, trinken!";
            case 11:
                return "Trinke so viele Shots, wie du Buchstaben in deinem Vornamen hast!";
            case 12:
                return "Alle, die Sneaker tragen, trinken!";
            case 13:
                return "Erfinde eine neue Trinkregel. Wer sie bricht, trinkt!";
            case 14:
                return "Trinke, wenn du heute schon Kaffee getrunken hast!";
            case 15:
                return "Alle, die blond sind, trinken!";
            case 16:
                return "Wähle eine Person aus, die deinen nächsten Shot aussucht.";
            case 17:
                return "Trinke, wenn du heute schon etwas Gesundes gegessen hast!";
            case 18:
                return "Alle, die ein Haustier haben, trinken!";
            case 19:
                return "Trinke, wenn du heute schon Sport gemacht hast!";
            default:
                return "Sauf!";
        }
    }
}