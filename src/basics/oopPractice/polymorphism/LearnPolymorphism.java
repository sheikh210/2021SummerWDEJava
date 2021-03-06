package basics.oopPractice.polymorphism;

public class LearnPolymorphism {

    /*
    2 Different Types of Polymorphism
        1 - Compile-Time Polymorphism | Static Polymorphism (Method Overloading)
            - Name of the method
            - Number of parameters
            - Data types of parameters
            - Order of parameters
        2 - Run-Time Polymorphism | Dynamic Polymorphism (Method Overriding)
            - Name of the method
            - Number of parameters
            - Data types of parameters
            - Order of parameters
     */

    public static void main(String[] args) {
        int x = addition(5, 6);

    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static double addition(double x, double y) {
        return x + y;
    }

    public static int addition(int x, int y, int z) {
        return x + y + z;
    }

}
