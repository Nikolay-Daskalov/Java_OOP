import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {// Main
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String card = reader.readLine();
        String input = reader.readLine();

        int cardPower = Card.GetValue(input, Cards.valueOf(card).ordinal() + 2);

        System.out.printf("Card name: %s of %s; ", card, input);
        System.out.println("Card power: " + cardPower);
        reader.close();
    }
}