public class Main {
    public static void main(String[] args) {

        System.out.println("Cards:");

        for (Cards cards : Cards.values()) {
            System.out.printf("Ordinal value: %d; ", cards.ordinal());
            System.out.println("Name value: " + cards.name());
        }
    }
}