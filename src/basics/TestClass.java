package basics;

public class TestClass {

    public static void main(String[] args) {
        SingletonPractice obj1 = SingletonPractice.getInstance();
        SingletonPractice obj2 = SingletonPractice.getInstance();
        SingletonPractice obj3 = SingletonPractice.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

    }

}
