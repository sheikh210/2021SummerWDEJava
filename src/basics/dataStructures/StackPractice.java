package basics.dataStructures;

import java.util.Stack;

public class StackPractice {

    /*
    Members within a stack are accessed using LIFO - Last In, First Out
        1 - Dynamic in size - Can grow/shrink as needed
        2 - Holds elements of similar types (this is defined at declaration)
        3 - Values are ordered
        4 - In order to remove a value/element in the middle of a stack, you must first remove all the values/elements
            that come before it
     */

    public static void main(String[] args) {

        String[] names = {"Sami", "Eddy", "Roly", "Taher", "Sabreen"};

        for(String name : names) {
            System.out.println(name);
        }

        Stack<Integer> myStack = new Stack<>();

        myStack.add(1);
        myStack.add(2);
        myStack.add(3);
        myStack.add(4);
        myStack.add(5);
        myStack.add(6);

        System.out.println("PEEK: " + myStack.peek());
        System.out.println("INDEX AT: " + myStack.elementAt(5));
        System.out.println("POP");
        myStack.pop();
        System.out.println("PEEK: " + myStack.peek());
        System.out.println("INDEX AT: " + myStack.elementAt(5));

    }
}
