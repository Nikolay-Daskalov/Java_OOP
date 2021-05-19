public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm);
        this.fuelIncreasing();
    }
    @Override
    public void refueling(double fuel) {
        this.fuelQuantity += fuel * 0.95;
    }

    @Override
    public void fuelIncreasing() {
        this.fuelConsumptionPerKm += 1.6;
    }
}