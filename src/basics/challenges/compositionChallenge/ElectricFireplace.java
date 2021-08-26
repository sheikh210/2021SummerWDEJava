package basics.challenges.compositionChallenge;

public class ElectricFireplace {

    public enum HeatIntensity{
        LOW, MEDIUM, HIGH;
    }

    private boolean isOn;
    private String heatIntensity;

    public ElectricFireplace() {
        this.isOn = false;
        this.heatIntensity = null;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getHeatIntensity() {
        return heatIntensity;
    }

    public void setHeatIntensity(HeatIntensity intensity) {
        this.heatIntensity = intensity.toString();
    }

    public void turnOn(HeatIntensity intensity) {
        if(this.isOn) {
            System.out.println("Fireplace is already on");
        } else {
            this.isOn = true;
            System.out.println("Fireplace is on");
            this.heatIntensity = intensity.toString();
        }

        System.out.println("Heat intensity is set to " + this.heatIntensity);
    }

    public void turnOff() {
        if(!this.isOn) {
            System.out.println("Fireplace is already off");
        } else {
            this.isOn = false;
            this.heatIntensity = null;
            System.out.println("Fireplace is off");
        }
    }


}
