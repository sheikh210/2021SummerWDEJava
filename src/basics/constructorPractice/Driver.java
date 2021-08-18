package basics.constructorPractice;

public class Driver {

//    public static void main(String[] args) {
//        Student reza = new Student("Reza", "Aboudi", 'M', 25, "2042NY");
//
//        System.out.println("FIRST NAME: " + reza.firstName);
//        System.out.println("LAST NAME: " + reza.lastName);
//        System.out.println("AGE: " + reza.age);
//        System.out.println("GENDER: " + reza.gender);
//        System.out.println("STUDENT ID: " + reza.studentId);
//    }

    public static void main(String[] args) {

        String name = "Sami";

        Burger basicHamburger = new Burger("Beef", "Bun", true);
        Burger doubleCheeseburger = new Burger("Elk", "Whole Grain", true, "American Cheese");
        Burger deluxeBurger = new Burger("Venison", "Artisan", true, "Brie", "Lettuce", "Mayo", "Spicy Mustard", "Onions", "Pickles");

        Burger[] myBurgerArray = new Burger[3];

        myBurgerArray[0] = basicHamburger;
        myBurgerArray[1] = doubleCheeseburger;
        myBurgerArray[2] = deluxeBurger;

        System.out.println(basicHamburger);
        System.out.println(myBurgerArray[0]);
        System.out.println(doubleCheeseburger);
        System.out.println(myBurgerArray[1]);

        int x = 100;
        int y = 10;

        int[] myIntArray = new int[2];
        myIntArray[0] = x;
        myIntArray[1] = y;

        System.out.println(x);
        System.out.println(myIntArray[0]);
    }
}
