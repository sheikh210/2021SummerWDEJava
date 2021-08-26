package basics.challenges.compositionChallenge;

public class MainDriver {

    public static void main(String[] args) {
        Wall wall1 = new Wall(Wall.Directions.NORTH, "Blue");
        Wall wall2 = new Wall(Wall.Directions.SOUTH, "Blue");
        Wall wall3 = new Wall(Wall.Directions.EAST, "Blue");
        Wall wall4 = new Wall(Wall.Directions.WEST, "White");
        Television tv = new Television("Samsung", 65, true);
        ElectricFireplace fireplace = new ElectricFireplace();
        Window window = new Window(false, true);


        LivingRoom samisLivingRoom = new LivingRoom(wall1, wall2, wall3, wall4, tv, fireplace, window);

        samisLivingRoom.electricFireplace.turnOn(ElectricFireplace.HeatIntensity.LOW);
        samisLivingRoom.electricFireplace.turnOn(ElectricFireplace.HeatIntensity.HIGH);

        System.out.println(samisLivingRoom.wall1.getDirection());
        System.out.println(samisLivingRoom.wall2.getDirection());
        System.out.println(samisLivingRoom.wall3.getDirection());
        System.out.println(samisLivingRoom.wall4.getDirection());

    }
}
