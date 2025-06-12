package pl.pp;
public class Motorcycle extends Vehicle implements FuelType {
    private boolean hasSidecar;
    private String fuelType;

    public Motorcycle(String registrationNumber, String vinNumber, String color,
                      double price, double fuelConsumption, double fuelLevel,
                      double mileage, boolean hasSidecar, String fuelType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hasSidecar = hasSidecar;
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }
}
