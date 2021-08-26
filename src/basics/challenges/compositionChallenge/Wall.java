package basics.challenges.compositionChallenge;

public class Wall {

    public enum Directions{
        NORTH, EAST, WEST, SOUTH;
    }

    private String direction;
    private String color;

    public Wall(Directions direction, String color) {
        this.direction = direction.toString();
        this.color = color;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(Directions direction) {
        this.direction = direction.toString();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
