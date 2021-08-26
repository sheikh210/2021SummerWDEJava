package basics.challenges.compositionChallenge;

public class Television {

    private String manufacturer;
    private int screenSize;
    private boolean is4k;
    private boolean isOn;

    public Television(String manufacturer, int screenSize, boolean is4k) {
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.is4k = is4k;
        this.isOn = false;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isIs4k() {
        return is4k;
    }

    public void setIs4k(boolean is4k) {
        this.is4k = is4k;
    }

    public void turnOn() {
        if(this.isOn) {
            System.out.println("TV is already on");
        } else {
            this.isOn = true;
            System.out.println("TV is on");
        }
    }

    public void turnOff() {
        if(!this.isOn) {
            System.out.println("TV is already off");
        } else {
            this.isOn = false;
            System.out.println("TV is off");
        }
    }
}
