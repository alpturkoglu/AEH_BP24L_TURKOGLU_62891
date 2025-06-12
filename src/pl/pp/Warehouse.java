package pl.pp;

public class Warehouse {
    private String warehouseNumber;
    private int totalSpace;
    private int occupiedSpace;
    private String ownerName;
    private String email;
    private String phoneNumber;

    public Warehouse(String warehouseNumber, int totalSpace, String ownerName, String email, String phoneNumber) {
        this.warehouseNumber = warehouseNumber;
        this.totalSpace = totalSpace;
        this.occupiedSpace = 0;
        this.ownerName = ownerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // GETTERS
    public String getWarehouseNumber() { return warehouseNumber; }
    public int getTotalSpace() { return totalSpace; }
    public int getOccupiedSpace() { return occupiedSpace; }
    public String getOwnerName() { return ownerName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }

    // SETTERS
    public void setWarehouseNumber(String warehouseNumber) { this.warehouseNumber = warehouseNumber; }
    public void setTotalSpace(int totalSpace) { this.totalSpace = totalSpace; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // Ekleme işlemi
    public void addGoods(int amount) {
        if (occupiedSpace + amount <= totalSpace) {
            occupiedSpace += amount;
            System.out.println("Added " + amount + " units of goods. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        } else {
            System.out.println("Not enough space in the warehouse. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        }
    }

    // Çıkarma işlemi
    public void removeGoods(int amount) {
        if (amount <= occupiedSpace) {
            occupiedSpace -= amount;
            System.out.println("Removed " + amount + " units of goods. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        } else {
            System.out.println("Not enough goods in the warehouse to remove. Current occupied space: " + occupiedSpace + " units.");
        }
    }

    // Depo doluluk kontrolü
    public void checkOccupancy() {
        System.out.println("Occupied warehouse space: " + occupiedSpace + " units.");
        System.out.println("Available warehouse space: " + (totalSpace - occupiedSpace) + " units.");
    }

    // İletişim bilgilerini güncelle
    public void updateContact(String newEmail, String newPhoneNumber) {
        this.email = newEmail;
        this.phoneNumber = newPhoneNumber;
        System.out.println("Owner's contact details updated.");
        System.out.println("New email: " + email);
        System.out.println("New phone number: " + phoneNumber);
    }
}