package basics.oopPractice.inheritance;

public class Vehicle {

    /*
    Inheritance - "IS-A" Relationship
        Parent Class/Super class
        Child Class/Derived Class
     */

    String color;
    String mfr;
    String model;
    int numOfWheels;

    public Vehicle(String color, String mfr, String model, int numOfWheels) {
        this.color = color;
        this.mfr = mfr;
        this.model = model;
        this.numOfWheels = numOfWheels;
    }

    public void start() {
        System.out.println("Starting vehicle");
    }

    public void turnOff() {
        System.out.println("Turning off vehicle");
    }

    public void accelerate() {
        System.out.println("Accelerating");
    }

    public void decelerate() {
        System.out.println("Decelerating");
    }

}
