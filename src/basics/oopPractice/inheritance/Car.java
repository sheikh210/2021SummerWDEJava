package basics.oopPractice.inheritance;

public class Car extends Vehicle {

    int numOfDoors;
    int numOfSeats;
    String transmission;
    int horsepower;

    public Car(String color, String mfr, String model, int numOfWheels, int numOfDoors, int numOfSeats, String transmission, int horsepower) {
        super(color, mfr, model, numOfWheels);
        this.numOfDoors = numOfDoors;
        this.numOfSeats = numOfSeats;
        this.transmission = transmission;
        this.horsepower = horsepower;
    }

    public void steerLeft() {
        System.out.println("Steering car left");
    }

    public void steerRight() {
        System.out.println("Steering car right");
    }

}
