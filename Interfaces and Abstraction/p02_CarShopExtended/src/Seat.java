public class Seat extends CarImpl implements Sellable {
    public Seat(String model, String color, int horsePower,
                String countryProduced, double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    private Double price;

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s sells for %.2f EURO.",
                super.toString(), this.getModel(), this.getPrice());
    }
}
