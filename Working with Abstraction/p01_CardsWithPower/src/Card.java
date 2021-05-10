public class Card {
    public static int GetValue(String input, int value) {
        switch (input) {
            case "DIAMONDS":
                return value + 13;
            case "HEARTS":
                return value + 26;
            case "SPADES":
                return value + 39;
        }
        return value;
    }
}