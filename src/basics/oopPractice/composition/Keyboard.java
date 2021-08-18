package basics.oopPractice.composition;

public class Keyboard {

    String mfr;
    boolean isMechanical;
    boolean isQWERTY;

    public Keyboard(String mfr, boolean isMechanical, boolean isQWERTY) {
        this.mfr = mfr;
        this.isMechanical = isMechanical;
        this.isQWERTY = isQWERTY;
    }

    void turnOnBacklights() {
        System.out.println("Turned on keyboard RGB backlights");
    }

}
