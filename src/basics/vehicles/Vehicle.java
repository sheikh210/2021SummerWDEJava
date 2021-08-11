package basics.vehicles;

public class Vehicle {

    String typeOfVehicle;
    String manufacturer;
    String model;
    String color;
    boolean hasWheels;

    public Vehicle(String typeOfVehicle, String manufacturer, String model, String color, boolean hasWheels){
        this.typeOfVehicle = typeOfVehicle;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.hasWheels = hasWheels;
    }

    public void turnOn() {
        System.out.println(typeOfVehicle + " is turning on");
    }

    public void turnOff() {
        System.out.println(typeOfVehicle + " is turning off");
    }

    public void accelerate() {
        System.out.println(typeOfVehicle + " is accelerating");
    }

    public void decelerate() {
        System.out.println(typeOfVehicle + " is decelerating");
    }

    public void turnLeft() {
        System.out.println(typeOfVehicle + " turning left");
    }

    public void turnRight() {
        System.out.println(typeOfVehicle + " turning right");
    }

}
