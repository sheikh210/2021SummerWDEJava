package basics.constructorPractice;

public class Burger {

    // Instantiate = Create an instance of

    String typeOfMeat;
    String typeOfBread;
    boolean hasCheese;
    String typeOfCheese;
    String firstCondiment;
    String secondCondiment;
    String thirdCondiment;
    String fourthCondiment;
    String fifthCondiment;
    boolean isCombo;
    String firstSide;
    String secondSide;

    public Burger(String typeOfMeat, String typeOfBread, boolean hasCheese) {
        this.typeOfMeat = typeOfMeat;
        this.typeOfBread = typeOfBread;
        this.hasCheese = hasCheese;
    }

    public Burger(String typeOfMeat, String typeOfBread, boolean hasCheese, String typeOfCheese) {
        this.typeOfMeat = typeOfMeat; // "Elk"
        this.typeOfBread = typeOfBread; // "Whole Grain"
        this.hasCheese = hasCheese; // true

        if (hasCheese) {
            this.typeOfCheese = typeOfCheese;
        } else {
            this.typeOfCheese = null;
        }
    }

    public Burger(String typeOfMeat, String typeOfBread, boolean hasCheese, String typeOfCheese, String firstCondiment, String secondCondiment) {

    }

    public Burger(String typeOfMeat, String typeOfBread, boolean hasCheese, String typeOfCheese, String firstCondiment, String secondCondiment, String thirdCondiment) {

    }

    public Burger(String typeOfMeat, String typeOfBread, boolean hasCheese, String typeOfCheese, String firstCondiment, String secondCondiment, String thirdCondiment, String fourthCondiment) {

    }

    public Burger(String typeOfMeat, String typeOfBread, boolean hasCheese, String typeOfCheese, String firstCondiment, String secondCondiment, String thirdCondiment, String fourthCondiment, String fifthCondiment) {

    }

}
