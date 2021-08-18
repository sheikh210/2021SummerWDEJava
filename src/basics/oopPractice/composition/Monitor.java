package basics.oopPractice.composition;

public class Monitor {

    String mfr;
    String size;
    boolean isLED;
    WebCamera webCamera;

    public Monitor(String mfr, String size, boolean isLED, WebCamera webCamera) {
        this.mfr = mfr;
        this.size = size;
        this.isLED = isLED;
        this.webCamera = webCamera;
    }

    void turnOn() {
        System.out.println("Monitor is turning on");
    }

    void turnOff() {
        System.out.println("Monitor is turning off");
    }
}
