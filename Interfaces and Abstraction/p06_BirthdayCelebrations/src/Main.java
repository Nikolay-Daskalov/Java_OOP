import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        List<Birthable> list = new ArrayList<>();
        while (!input.equals("End")) {

            String[] tokens = input.split("\\s+");

            switch (tokens[0]) {
                case "Citizen":
                    list.add(new Citizen(tokens[1], Integer.parseInt(tokens[2]),
                            tokens[3], tokens[4]));
                    break;
                case "Pet":
                    list.add(new Pet(tokens[1], tokens[2]));
                    break;
                case "Robot":
                    list.add(new Robot(tokens[1], tokens[2]));
                    break;
            }
            input = reader.readLine();
        }

        input = reader.readLine();

        for (Birthable birthable : list) {
            if (birthable.getBirthDate() == null) {
                continue;
            }
            String s = birthable.getBirthDate()
                    .substring(birthable.getBirthDate().length() - 4);
            if (s.equals(input)) {
                System.out.println(birthable.getBirthDate());
            }
        }
        reader.close();
    }
}