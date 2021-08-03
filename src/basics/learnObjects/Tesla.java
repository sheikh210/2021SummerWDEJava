package basics.learnObjects;

public class Tesla {

    final String MANUFACTURER = "Tesla";
    String model;
    String color;
    int batterySize;
    boolean isManual;

    public static void main(String[] args) {
        int age = 25;
        Tesla tesla = new Tesla();

//        tesla.start();
//        tesla.shutOff();
//        tesla.accelerate();
//        tesla.decelerate();
    }

    public void start() {
        String action = "starting";
        System.out.println(MANUFACTURER + " is " + action);
    }

    public void shutOff () {
        String action = "shutting off";
        System.out.println(MANUFACTURER + " is " + action);
    }

    public void accelerate () {
        System.out.println(MANUFACTURER + " is accelerating");
    }

    public void decelerate () {
        System.out.println(MANUFACTURER + " is decelerating");
    }
}
