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
     */

    public static void main(String[] args) {
        // Array Declaration
        int[] myIntArray = new int[100];
        myIntArray[55] = 436;

        // Array Declaration + Initialization
        int[] myIntArray2 = {5, 20, 395, 3661, 33, 65, 32, 77};
        myIntArray2[3] = 75;
//        System.out.println(myIntArray2[3] + "\n" + myIntArray2[5]);
    }
}
