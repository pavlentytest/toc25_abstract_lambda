package dev4;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car("BMW");
        bmw.wheels = 5;
        Car toyota = new Car("Toyota");
        System.out.println(toyota.wheels); // 5

        int counter = Car.wheels;

       // Car.color = "Red";

       // Math.abs();
       // Math.cos();
       // Math.PI

        String color = Car.COLOR;
    }
}
class Car {
    private String name;
    public static int wheels = 4;
    public static final String COLOR = "White";

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}