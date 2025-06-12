package pl.pp;
public class RentalTest {
    public static void main(String[] args) {
        PassengerCar car = new PassengerCar("KR1234", "VIN1234", "Red", 50000, 6.0, 50, 10000, 4, "Gasoline");
        Truck truck = new Truck("WA9876", "VIN9876", "White", 120000, 15.0, 100, 30000, 5000, "Diesel");
        Motorcycle bike = new Motorcycle("GD5678", "VIN5678", "Black", 15000, 4.0, 10, 5000, false, "Gasoline");
        ConstructionEquipment bulldozer = new ConstructionEquipment("LD4321", "VIN4321", "Yellow", 250000, 20.0, 200, 8000, 120, "Diesel");

        car.drive(100);
        car.refuel(20);
        System.out.println("Fuel Type: " + car.getFuelType());

        truck.drive(150);
        System.out.println("Fuel Type: " + truck.getFuelType());

        bike.drive(30);
        System.out.println("Fuel Type: " + bike.getFuelType());

        bulldozer.drive(10);
        System.out.println("Fuel Type: " + bulldozer.getFuelType());
    }
}