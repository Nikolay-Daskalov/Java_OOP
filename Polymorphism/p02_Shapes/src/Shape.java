public abstract class Shape {
    private Double perimeter;
    private Double area;

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public double getPerimeter() {
        return this.calculatePerimeter();
    }

    public double getArea() {
        return this.calculateArea();
    }

    public Shape() {
    }
}
