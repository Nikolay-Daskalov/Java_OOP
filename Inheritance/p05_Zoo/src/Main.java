import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Animal snake = new Snake(reader.readLine());
        Animal gorilla = new Gorilla(reader.readLine());
        Animal mammal = new Mammal(reader.readLine());

        System.out.println(snake.getName());
        System.out.println(gorilla.getName());
        System.out.println(mammal.getName());

        reader.close();
    }
}