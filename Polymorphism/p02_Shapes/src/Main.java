import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Shape circle = new Circle(Double.parseDouble(reader.readLine()));
        Shape rectangle = new Rectangle(Double.parseDouble(reader.readLine()),
                Double.parseDouble(reader.readLine()));

        PrintShape(circle);
        PrintShape(rectangle);

        reader.close();
    }

    private static void PrintShape(Shape shape) {
        System.out.printf("The area of the %s is: %.2f.%n", shape.getClass().getSimpleName(),
                shape.getArea());
        System.out.printf("The perimeter of the %s is: %.2f.%n", shape.getClass().getSimpleName(),
                shape.getPerimeter());
    }
}