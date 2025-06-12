package pl.pp;


public class Person {
    String name;
    int age;
    String address;
    int year_of_birth;

    public Person(String name, int age, String address, int year_of_birth) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.year_of_birth = year_of_birth;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public void growOld(int years) {
        this.age += years;
    }

    public void beYounger() {
        this.age -= 1;
    }
}