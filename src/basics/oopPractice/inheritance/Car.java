package basics.oopPractice.inheritance;

public class Car extends Vehicle {

    public static void main(String[] args) {
        start();
        turnOff();
        accelerate();
        decelerate();
    }

    public void steerLeft() {
        System.out.println("Steering car left");
    }

    public void steerRight() {
        System.out.println("Steering car right");
    }

}
