package basics.learnObjects;

public class BuildAHome {

    public static void main(String[] args) {

        House house1 = new House();
        House house2 = new House();
        House house3 = new House();
        House house4 = new House();

        house1.color = "White";
        house2.color = "Blue";
        house3.color = "Purple";
        house4.color = "Red";
//
//        house1.method1();
//        house2.method1();
//        house3.method1();
//        house4.method1();

        house1.method2("This is argument 1", "This is argument 2");

//        house1.numOfFloors = 2;
//        house2.numOfFloors = 85;
//
//        System.out.println(house1.numOfFloors);
//        System.out.println(house2.numOfFloors);

    }

}
