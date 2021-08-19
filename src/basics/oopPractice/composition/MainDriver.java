package basics.oopPractice.composition;

public class MainDriver {

    public static void main(String[] args) {
        WebCamera logitechWebCamera = new WebCamera("Logitech", "2560 x 1080", true);
        Monitor acerMonitor = new Monitor("Acer", "27 inches", true, logitechWebCamera);
        Keyboard logitechKeyboard = new Keyboard("Logitech", false, true);
        Mouse logitechMouse = new Mouse("Logitech", true, true, true);
        PC lenovoPC = new PC("Intel Core i7", "Nvidia GEForce MX230", 16, 512);

        Computer lenovo = new Computer(acerMonitor, logitechKeyboard, logitechMouse, lenovoPC);

        System.out.println(lenovo.pc.diskSpace);
    }
}
