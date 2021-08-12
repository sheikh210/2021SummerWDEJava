package basics.controlFlow;

public class ForEachLoop {

    /*
    For-Each Loops - Used to iterate over data structures - we won't necessarily know the length of the data structure
     */

    public static void main(String[] args) {

        int[] myIntArray = {5, 3, 8, 29, 0, 18, 37, 4, 85, 100, 503, 12, 28, 84, 85, 62, 84, 16, 28};
        String[] phraseArray = {"Poyesh", "asked", "this", "question", "regarding", "Strings", "and", "String", "arrays"};

//        for (String x : phraseArray) {
//            String new_word = x + " - looped";
//
//            System.out.println(new_word);
//        }

        for (int x : myIntArray) {
            int y = x - 1;
            System.out.println(y);
        }









    }

}
