package basics;

public class Operators {

    /*
    Different Types of Operators
        1 - Arithmetic
        2 - Assignment
        3 - Comparison
     */

    public static void main(String[] args) {
        int x = 5;

        x += 1;
        System.out.println(x);

        x -= 1;
        System.out.println(x);
    }

    public int addition() {
        int x = 10;
        int y = 5;

        return x + y;
    }

    public int subtraction() {
        int x = 10;
        int y = 5;

        return x - y;
    }

    public int multiplication() {
        int x = 10;
        int y = 5;

        return x * y;
    }

    public int division() {
        int x = 10;
        int y = 5;

        return x / y;
    }

    public static int modulo() {
        int x = 28;
        int y = 5;

        return x % y;
    }


}
