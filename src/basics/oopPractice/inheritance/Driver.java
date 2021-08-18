package basics.oopPractice.inheritance;

import basics.constructorPractice.Burger;

public class Driver {

    public static void main(String[] args) {
//        Tesla modelS = new Tesla("White", "Tesla", "Model S", 4, 4, 5, "Automatic", 470);
//
//        modelS.accelerate();
//        modelS.decelerate();
//        modelS.steerLeft();
//        modelS.steerRight();
//        modelS.summon();
//
//        System.out.println(modelS.color);
//        System.out.println(modelS.mfr);
//        System.out.println(modelS.model);
//        System.out.println(modelS.numOfWheels);

        Driver obj = new Driver();

        Object x = obj.getTesla("White", "Model S Plaid", 470);

        if (x instanceof Car) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public Object getTesla(String color, String model, int horsepower) {
        return new Tesla(color, "Tesla", model, 4, 4, 6, "Automatic", horsepower);
    }
}
