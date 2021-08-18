package basics.oopPractice.abstraction;

public class MainDriver implements Interest {

    @Override
    public void doThisThing() {
        System.out.println("Doing this thing");
    }

    @Override
    public void doAnotherThing() {
        System.out.println("Doing another thing");
    }

    @Override
    public void doTheLastThing() {
        System.out.println("Doing the last thing");
    }
}
