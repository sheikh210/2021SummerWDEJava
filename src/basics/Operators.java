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
        // Assignment (=, +=, -=)
        int x = 5;

        x += 1;
//        System.out.println(x);

        x -= 1;
//        System.out.println(x);

        // Comparison Operators (==, !=, >, <, >=, <=)
        int a = 200;
        int b = 55;

//        System.out.println(a == b); // False
//        System.out.println(a != b); // True
//        System.out.println(a > b); // True
//        System.out.println(a < b); // False
//        System.out.println(a >= b); // True
//        System.out.println(a <= b); // False

        // Logical Operators (&&, ||)
        int c = 50;
        int d = 199;

        boolean result1 = (a >= d) && (c >= b);
        boolean result2 = (a >= d) || (c >= b);

        System.out.println(result1);
        System.out.println(result2);

    }

    // Arithmetic Operators (+, -, /, *, %)
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
