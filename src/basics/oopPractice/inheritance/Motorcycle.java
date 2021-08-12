package basics.oopPractice.inheritance;

public class Motorcycle extends Vehicle {

    int cc;
    String typeOfMotorcycle;
    boolean hasSeatCompartment;
    boolean hasKickstand;



    public void putInKickstand() {
        System.out.println("Bicycle is off of kickstand");
    }

    public void putOutKickstand() {
        System.out.println("Bicycle is standing on its kickstand");
    }

    public void steerLeft() {
        System.out.println("Steering motorcycle left");
    }

    public void steerRight() {
        System.out.println("Steering motorcycle right");
    }
}
