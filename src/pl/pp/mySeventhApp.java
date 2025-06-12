package pl.pp;
public class mySeventhApp {
    public static void main(String[] args) {
        Person person1 = new Person("Alp", 20, "Warsaw", 2004);

        person1.sayHello();
        person1.growOld(10);
        System.out.println("Age after growing old: " + person1.age);

        person1.beYounger();
        System.out.println("Age after being younger: " + person1.age);
    }
}