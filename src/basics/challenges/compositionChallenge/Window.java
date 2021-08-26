package basics.challenges.compositionChallenge;

public class Window {

    private boolean isOpen;
    private boolean isLocked;

    public Window(boolean isOpen, boolean isLocked) {
        this.isOpen = isOpen;
        this.isLocked = isLocked;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public void open() {
        this.isOpen = true;
        System.out.println("Window is now open");
    }

    public void close() {
        this.isOpen = false;
        System.out.println("Window is now closed");
    }

    public void lock() {
        if(this.isOpen) {
            close();
        }
        
        System.out.println("Window is locked");
    }
}
