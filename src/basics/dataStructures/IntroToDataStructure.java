package basics.dataStructures;

import basics.constructorPractice.Burger;

import java.util.ArrayList;
import java.util.List;

public class IntroToDataStructure {

    /*
        Array - Collection of similar data types
              - Once an array is initialized, its size cannot be changed
              - Index ALWAYS STARTS FROM 0 INDEX
              - Values stay ordered, unlike a Set
              - Arrays can hold duplicate values

        List  - Lists are dynamic in size, meaning, we can alter the size of a list even after initialization
              - Lists can hold duplicate values
              - Lists can hold different data types as values, UNLESS we restrict the type upon initializing
     */

    public static void main(String[] args) {
        // Array Declaration
        int[] myIntArray = new int[100];
        myIntArray[55] = 436;

        // Array Declaration + Initialization
        int[] myIntArray2 = {5, 20, 395, 3661, 33, 65, 32, 77};
        myIntArray2[3] = 75;
//        System.out.println(myIntArray2[3] + "\n" + myIntArray2[5]);


        // List Declaration
        List<String> myList = new ArrayList<>();
        myList.add(0, "Sabreen");
        myList.add(1, "Eddy");
        myList.add(2, "Bibi");
        myList.add(3, "Aghiles");
        myList.add(4, "Jayson");
        myList.add(5, "Jayson");

//        System.out.println(myList.size());
//        System.out.println(myList.get(4));
//        System.out.println(myList.get(5));

//        System.out.println(myList.indexOf("Jayson"));
        List<String> subList = myList.subList(2, 4);

//        System.out.println(subList.get(1));

        if (myList.contains("Jayson")) {
            System.out.println("Jayson is the greatest Java student alive");
        } else {
            System.out.println("JK, hes alright");
        }

    }
}
