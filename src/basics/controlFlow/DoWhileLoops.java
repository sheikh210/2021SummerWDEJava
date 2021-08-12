package basics.controlFlow;

public class DoWhileLoops {

    /*
    Do...While Loops - Used ONLY when we are uncertain about the number of iterations/loops we need AND we need to
                       execute the code at LEAST 1 time.
     */

    public static void main(String[] args) {

        int a = 1;
        int b = 20;

        do {
            a++;
            System.out.println("The value of a: " + a);
        } while (a < b);

    }

}
