package pl.pp;
public class Truck extends Vehicle implements FuelType {
    private double loadCapacity;
    private String fuelType;

    public Truck(String registrationNumber, String vinNumber, String color,
                 double price, double fuelConsumption, double fuelLevel,
                 double mileage, double loadCapacity, String fuelType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.loadCapacity = loadCapacity;
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }
}
