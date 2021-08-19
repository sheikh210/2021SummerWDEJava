package basics;

public class SingletonPractice {

    private static SingletonPractice obj = new SingletonPractice();

    private SingletonPractice() {

    }

    public static SingletonPractice getInstance() {
        return obj;
    }
}
