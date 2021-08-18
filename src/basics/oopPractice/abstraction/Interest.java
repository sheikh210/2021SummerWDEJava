package basics.oopPractice.abstraction;

public interface Interest {

    /*
    Interfaces - Inherently abstract (no need for abstract keyword)
               - ALL methods in an interface MUST be abstract (no implementation)
               - ALL global variables are implicitly static + final (constant)
     */

    double INTEREST_RATE = 2.75;

    void doThisThing();

    void doAnotherThing();

    void doTheLastThing();

}
