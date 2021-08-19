package basics.oopPractice.composition;

public class PC {

    String cpu;
    String gfx;
    int ram;
    int diskSpace;

    public PC(String cpu, String gfx, int ram, int diskSpace) {
        this.cpu = cpu;
        this.gfx = gfx;
        this.ram = ram;
        this.diskSpace = diskSpace;
    }
}
