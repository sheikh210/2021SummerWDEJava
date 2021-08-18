package basics.oopPractice.polymorphism;

public class LearnOverridingParent {

    public static void main(String[] args) {
        LearnOverridingParent obj = new LearnOverridingParent();

        obj.doSomething();
    }

    public void doSomething() {
        System.out.println("The parent method is doing something");
    }

}
