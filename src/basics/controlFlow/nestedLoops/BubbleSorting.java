package basics.controlFlow.nestedLoops;

public class BubbleSorting {

    /*
    Bubble Sort - One method to sort a list/array of numbers
     */

    public static void main(String[] args) {

        int[] myUnsortedArray = {5, 49, 89, 72, 17, 130, 25, 44, 10, 60};
        System.out.println("UNSORTED:");
        for(int x : myUnsortedArray) {
            System.out.print(x + ", ");
        }
        int temp;

        for(int i = 0; i < myUnsortedArray.length; i++) {

            for (int j = 1; j < myUnsortedArray.length - i; j++) {

                if (myUnsortedArray[j-1] > myUnsortedArray[j]) {
                    temp = myUnsortedArray[j-1];
                    myUnsortedArray[j-1] = myUnsortedArray[j];
                    myUnsortedArray[j] = temp;
                }
            }
        }

        System.out.println("\nSORTED:");
        for(int x : myUnsortedArray) {
            System.out.print(x + ", ");
        }
    }

}
