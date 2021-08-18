package basics.oopPractice.composition;

public class Computer {

    /*
    Composition - "HAS-A" Relationship
     */

    Monitor monitor;
    Keyboard keyboard;
    Mouse mouse;

    public Computer(Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

}
