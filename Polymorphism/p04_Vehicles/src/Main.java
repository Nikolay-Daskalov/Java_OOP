import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carLine = reader.readLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(carLine[1]),
                Double.parseDouble(carLine[2]));

        String[] truckLine = reader.readLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(truckLine[1]),
                Double.parseDouble(truckLine[2]));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            if (input[0].equals("Drive")) {
                if (input[1].equals("Car")) {
                    System.out.println(car.driving(Double.parseDouble(input[2])));
                } else {
                    System.out.println(truck.driving(Double.parseDouble(input[2])));
                }
            } else {
                if (input[1].equals("Car")) {
                    car.refueling(Double.parseDouble(input[2]));
                } else {
                    truck.refueling(Double.parseDouble(input[2]));
                }
            }
        }

        System.out.println(car.toString());
        System.out.println(truck.toString());

        reader.close();
    }
}