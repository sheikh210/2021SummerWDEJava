package basics.oopPractice.polymorphism;

public class LearnOverridingChild extends LearnOverridingParent {

    public static void main(String[] args) {
        LearnOverridingChild obj = new LearnOverridingChild();

        obj.doSomething();
    }

    public void doSomething() {
        super.doSomething();
        System.out.println("The child method is doing something");
    }

}
