package basics;

public class Operators {

    /*
    Different Types of Operators
        1 - Arithmetic
        2 - Assignment
        3 - Comparison
        4 - Logical
     */

    public static void main(String[] args) {
//        int x = 5;
//
//        x += 1;
//        System.out.println(x);
//
//        x -= 1;
//        System.out.println(x);
//
//        int a = 10;
//        int b = 10;
//
//        System.out.println(a == b);
//        System.out.println(a != b);
//
        String msg1 = "Hello, World";
        String msg2 = "Hello, world";

        boolean isDifferent = !(msg1.equals(msg2));

        System.out.println(isDifferent);

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
