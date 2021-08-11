package basics.learnObjects;

public class House {

    // Non-static global variables are known as instance variables - They are shared amongst all objects/instances of the class
    // Static variables are just known as static variables - Their value are shared by all objects of the class

    String color;
    int numOfFloors;
    boolean hasGarage;

    public static void main(String[] args) {
        String phrase = "Poyesh is a great student";
        String[] phrases = {"Poyesh"," ", "is", " ", "a", " ", "great", "", "student"};

        System.out.println(phrases[0]);
    }
    public House() {

    }

    public void method1(){
        System.out.println("The color of this house is " + color);
    }

    public void method2(String param1, String param2){
        System.out.println(param1 + "\n" + param2);

    }

    public void method3() {

    }

}
