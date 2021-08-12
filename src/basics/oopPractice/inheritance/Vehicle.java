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

    public static void start() {
        System.out.println("Starting vehicle");
    }

    public static void turnOff() {
        System.out.println("Turning off vehicle");
    }

    public static void accelerate() {
        System.out.println("Accelerating");
    }

    public static void decelerate() {
        System.out.println("Decelerate");
    }

}
