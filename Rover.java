public class Rover {
    private Position position;
    private Direction direction;

    public Rover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public void move() {
        // Implement movement logic
    }

    public void turnLeft() {
        // Implement turning left logic
    }

    public void turnRight() {
        // Implement turning right logic
    }

    public String getStatus() {
        return "Rover is at " + position + " facing " + direction;
    }
}
