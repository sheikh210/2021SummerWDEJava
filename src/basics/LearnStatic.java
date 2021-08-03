package basics;

public class LearnStatic {

    static String name = "Sami";

    public static void main(String[] args) {
        LearnStatic obj = new LearnStatic();
        obj.printName();
    }

    public void printName() {
        System.out.println("Hello, my name is " + name);
    }



}
