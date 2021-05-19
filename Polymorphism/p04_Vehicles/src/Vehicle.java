import java.text.DecimalFormat;

public abstract class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumptionPerKm;

    public Vehicle(double fuelQuantity, double fuelConsumptionPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    public String driving(double distance) {
        double current = distance * this.fuelConsumptionPerKm;
        if (this.fuelQuantity >= current) {
            this.fuelQuantity -= current;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            return String.format("%s travelled %s km", this.getClass().
                    getName(), decimalFormat.format(distance));
        } else {
            return String.format("%s needs refueling", this.getClass().getName());
        }
    }

    public abstract void refueling(double fuel);

    public abstract void fuelIncreasing();

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getName(), this.fuelQuantity);
    }
}