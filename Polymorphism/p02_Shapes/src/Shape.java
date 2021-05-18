public abstract class Shape {

    protected abstract double calculatePerimeter();

    protected abstract double calculateArea();

    public double getPerimeter() {
        return this.calculatePerimeter();
    }

    public double getArea() {
        return this.calculateArea();
    }

    public Shape() {
    }
}
