public class Circle extends Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    protected double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}