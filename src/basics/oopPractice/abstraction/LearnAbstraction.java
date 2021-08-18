package basics.oopPractice.abstraction;

public abstract class LearnAbstraction {

    /*
    Abstraction - Abstraction is the process of hiding the implementation details from the user, only the functionality
                  will be provided to the user. In other words, the user will have the information on what the object
                  does instead of exactly how it does it.

              Rules
              1 - Abstract Classes canNOT be instantiated
              2 - Abstract Classes can contain abstract methods, but it is not required
              3 - Abstract Classes can contain concrete methods, but it is not required
              4 - Abstract Classes can contain abstract + concrete methods, but neither are required
              5 - As soon as you provide an abstract method in a class, that class MUST be declared abstract
     */

    public abstract void doSomething();

    public void doSomethingElse() {
        System.out.println("Doing something else");
    }
}
