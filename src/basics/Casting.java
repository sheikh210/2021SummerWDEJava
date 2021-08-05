package basics;

public class Casting {

    /*
    Converting one data type to another data type
        - Widening - No data loss
        - Narrowing - Data loss
     */

    public static void main(String[] args) {
        // Narrowing
//        long y = 5084564L;
//        int x = (int) y;

        // Widening
//        int a = 5000;
//        long b = a;

//        System.out.println(y);
//        System.out.println(x);

//        System.out.println(a);
//        System.out.println(b);

        // Wrapper classes - Primitive to Non-primitive and vice-versa
        String x = "10";
        String y = "15";

        int a = Integer.valueOf(x);
        int b = Integer.valueOf(y);

        System.out.println(a + b);

        int i = 5;
        int j = 10;
        String l = String.valueOf(i);
        String k = String.valueOf(j);

        System.out.println(l + k);
    }
}
