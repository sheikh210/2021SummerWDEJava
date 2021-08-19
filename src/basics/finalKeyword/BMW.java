package basics.finalKeyword;

public class BMW {

    public enum Models {
        BMW_128xi,
        BMW_135xi,
        BMW_230i,
        BMW_230xi,
        BMW_G80_M3_Competition

    }

    Models model;
    int numOfCylinders;
    int horsepower;
    boolean isXDrive;
    boolean hasTurbo;
    boolean isCoupe;
    boolean hasMSportPackage;
    boolean hasMPerformancePackage;

    public BMW(Models model){
        this.model = model;
    }


    public static void main(String[] args) {
    }

}
