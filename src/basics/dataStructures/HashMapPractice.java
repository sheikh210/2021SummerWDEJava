package basics.dataStructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {

    /*
    HashMaps store values using key-value pairs
        - You cannot have duplicate keys
        - However, you can have duplicate values
     */

    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>();

        myHashMap.put(1, "Zahra");
        myHashMap.put(2, "Aghiles");
        myHashMap.put(3, "Rabai");
        myHashMap.put(4, "Sabreen");
        myHashMap.put(5, "Mohammed");
        myHashMap.put(6, "Mohammed");

        Set<Integer> keySet = myHashMap.keySet();
        Set<Map.Entry<Integer, String>> entrySet = myHashMap.entrySet();

        for(Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

//        for (int x: keySet) {
//            System.out.println("KEY: " + x);
//            System.out.println("VALUE: " + myHashMap.get(x));
//        }

    }

}
