package basics.oopPractice.composition;

public class Computer {

    /*
    Composition - "HAS-A" Relationship
     */

    Monitor monitor;
    Keyboard keyboard;
    Mouse mouse;
    PC pc;

    public Computer(Monitor monitor, Keyboard keyboard, Mouse mouse, PC pc) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.pc = pc;
    }

}
