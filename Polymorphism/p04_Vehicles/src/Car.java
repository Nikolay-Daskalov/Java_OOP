public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm);
        this.fuelIncreasing();
    }

    @Override
    public void refueling(double fuel) {
        this.fuelQuantity += fuel;
    }

    @Override
    public void fuelIncreasing() {
        this.fuelConsumptionPerKm += 0.9;
    }
}