package basics.controlFlow;

public class WhileLoops {

    /*
    While Loops - Used ONLY when we are uncertain about the number of iterations/loops we need. This loop
                  will run WHILE a condition is true.
     */


    public static void main(String[] args) {

        int a = 1;
        int b = 20;

        while (a < b) {

            if (a != b) {
                System.out.println(a + " is less than " + b);
            } else {
                System.out.println(a + " is equal to " + b);
            }

            a++;
        }


    }



}
