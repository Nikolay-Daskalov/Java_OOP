import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Car seat = new Seat("Leon", "Gray", 110, "Spain", 20250);
        Car audi = new Audi("A4", "Silver", 300, "Germany", 3, 99.9);

        printCarInfo(seat);
        printCarInfo(audi);
        reader.close();
    }

    private static void printCarInfo(Car car) {
        System.out.println(String.format(
                "%s is %s color and have %s horse power.",
                car.getModel(),
                car.getColor(),
                car.getHorsePower()));
        System.out.println(car.toString());
    }
}