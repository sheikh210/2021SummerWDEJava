package basics.oopPractice.composition;

public class WebCamera {

    String mfr;
    String resolution;
    boolean isHD;

    public WebCamera(String mfr, String resolution, boolean isHD) {
        this.mfr = mfr;
        this.resolution = resolution;
        this.isHD = isHD;
    }

    void takePicture() {
        System.out.println("Taking picture with " + mfr + " webcam");
    }
}
