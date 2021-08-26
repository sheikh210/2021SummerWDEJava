package basics.challenges.compositionChallenge;

public class LivingRoom {

    Wall wall1;
    Wall wall2;
    Wall wall3;
    Wall wall4;
    Television television;
    ElectricFireplace electricFireplace;
    Window window;

    public LivingRoom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Television television, ElectricFireplace electricFireplace, Window window) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.television = television;
        this.electricFireplace = electricFireplace;
        this.window = window;
    }
}
