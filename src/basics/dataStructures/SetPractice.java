package basics.dataStructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        myList.add(5);
//
//        Set<Integer> integerSet = new HashSet<>();
//        integerSet.addAll(myList);
//
//        System.out.println(integerSet);

        Set<Object> set1 = new HashSet<>();
        set1.add(4);
        set1.add("Eddy");
        set1.add("Solomon");
        set1.add(4.6f);
        set1.add(true);
        System.out.println("SET 1: " + set1);

        Set<Object> set2 = new HashSet<>();
        set2.add(5);
        set2.add("Eddy");
        set2.add("Sami");
        set2.add(4.89d);
        set2.add(false);
        System.out.println("SET 2: " + set2);

        Set<Object> set3 = new HashSet<>(set1);

        set3.addAll(set2);
        System.out.println("\nUNION OF SET1 AND SET2: " + set3);

        Set<Object> set4 = new HashSet<>(set1);
        set4.retainAll(set2);
        System.out.println("\nINTERSECTION OF SET1 AND SET2: " + set4);
    }
}
