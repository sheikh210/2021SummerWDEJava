package basics.oopPractice.composition;

public class Mouse {

    String mfr;
    boolean hasScrollWheel;
    boolean isOptical;
    boolean isWireless;

    public Mouse(String mfr, boolean hasScrollWheel, boolean isOptical, boolean isWireless) {
        this.mfr = mfr;
        this.hasScrollWheel = hasScrollWheel;
        this.isOptical = isOptical;
        this.isWireless = isWireless;
    }

    void moveMouse(int pixels) {
        System.out.println("Moving mouse " + pixels + " pixels");

        for (int i = 0; i <= pixels; i++) {
            System.out.println("Moving mouse - currently at pixel " + i);
        }

        System.out.println("Mouse moved " + pixels + " pixels");
    }
}
