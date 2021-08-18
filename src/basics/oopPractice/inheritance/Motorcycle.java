package basics.oopPractice.inheritance;

public class Motorcycle extends Vehicle {

    int cc;
    String typeOfMotorcycle;
    boolean hasSeatCompartment;
    boolean hasKickstand;

    public Motorcycle(String color, String mfr, String model, int numOfWheels, int cc, String typeOfMotorcycle, boolean hasSeatCompartment, boolean hasKickstand) {
        super(color, mfr, model, numOfWheels);

        this.cc = cc;
        this.typeOfMotorcycle = typeOfMotorcycle;
        this.hasSeatCompartment = hasSeatCompartment;
        this.hasKickstand = hasKickstand;
    }

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
