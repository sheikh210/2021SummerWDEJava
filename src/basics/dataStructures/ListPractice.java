package basics.dataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {

    /*
     List  - Lists are dynamic in size, meaning, we can alter the size of a list even after initialization
              - Lists can hold duplicate values
              - Lists can hold different data types as values, UNLESS we restrict the type upon initializing
     */

    public static void main(String[] args) {
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

        System.out.println(myList.indexOf("Jayson"));
        List<String> subList = myList.subList(2, 4);

//        System.out.println(subList.get(1));

        if (myList.contains("Jayson")) {
            System.out.println("Jayson is the greatest Java student alive");
        } else {
            System.out.println("JK, hes alright");
        }


        /*
        Linked List
         */

        List<String> mySecondList = new LinkedList<>();


        /*
        Doubly Linked List
         */




    }
}
