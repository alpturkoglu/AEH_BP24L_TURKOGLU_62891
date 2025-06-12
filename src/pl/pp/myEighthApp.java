package pl.pp;
public class myEighthApp {
    public static void main(String[] args) {
        Account myAccount = new Account("123456", 1000.0, "Alp Turkoglu", "alp@example.com", "123456789");

        myAccount.withdraw(900.0);
        myAccount.deposit(250.0);
        myAccount.withdraw(50.0);
        myAccount.withdraw(500.0); // Bu işlem başarısız olmalı
    }
}