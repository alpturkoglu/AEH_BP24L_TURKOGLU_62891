package pl.pp;
public class myNinthApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse("WH-001", 5000, "Alp Turkoglu", "alp@example.com", "123456789");

        warehouse.addGoods(3000);
        warehouse.removeGoods(1000);
        warehouse.addGoods(2500);
        warehouse.checkOccupancy();
        warehouse.updateContact("owner@magazyn.pl", "+48 123 456 789");
        warehouse.addGoods(600); // Bu işlem başarısız olmalı
        warehouse.removeGoods(6000); // Bu işlem de başarısız olmalı
    }
}