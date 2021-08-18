package basics.oopPractice.inheritance;

public class Tesla extends Car {

    public Tesla(String color, String mfr, String model, int numOfWheels, int numOfDoors, int numOfSeats, String transmission, int horsepower){
        super(color, mfr, model, numOfWheels, numOfDoors, numOfSeats, transmission, horsepower);

    }

    public void summon(){
        System.out.println("Tesla is being summoned to your location");
    }

}
