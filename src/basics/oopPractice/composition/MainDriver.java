package basics.oopPractice.composition;

public class MainDriver {

    public static void main(String[] args) {
        WebCamera webCamera = new WebCamera("Logitech", "2560 x 1080", true);
        Monitor acerMonitor = new Monitor("Acer", "27 inches", true, webCamera);
        Keyboard logitechKeyboard = new Keyboard("Logitech", false, true);
        Mouse logitechMouse = new Mouse("Logitech", true, true, true);

        Computer lenovo = new Computer(acerMonitor, logitechKeyboard, logitechMouse);

        lenovo.monitor.webCamera.takePicture();
    }
}
