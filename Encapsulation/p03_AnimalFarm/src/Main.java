import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Chicken> chickens = new ArrayList<>();

        while (--n > 0) {
            String[] tokens = reader.readLine().split("\\s+");
            chickens.add(new Chicken(tokens[0], Integer.parseInt(tokens[1])));
        }

        for (Chicken chicken : chickens) {
            System.out.println(chicken.toString());
        }

        reader.close();
    }
}
