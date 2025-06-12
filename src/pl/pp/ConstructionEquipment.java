package pl.pp;
public class ConstructionEquipment extends Vehicle implements FuelType {
    private int hoursWorked;
    private String fuelType;

    public ConstructionEquipment(String registrationNumber, String vinNumber, String color,
                                 double price, double fuelConsumption, double fuelLevel,
                                 double mileage, int hoursWorked, String fuelType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hoursWorked = hoursWorked;
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }
}