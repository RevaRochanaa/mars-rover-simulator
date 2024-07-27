public class Rover {
    private Position position;
    private Direction direction;
    private Grid grid;

    public Rover(Position position, Direction direction, Grid grid) {
        this.position = position;
        this.direction = direction;
        this.grid = grid;
    }

    public void move() {
        Position newPosition = getNextPosition();
        if (grid.isValidMove(newPosition)) {
            this.position = newPosition;
        } else {
            System.out.println("Movement blocked. Staying in place.");
        }
    }

    private Position getNextPosition() {
        switch (direction) {
            case NORTH: return new Position(position.getX(), position.getY() + 1);
            case SOUTH: return new Position(position.getX(), position.getY() - 1);
            case EAST: return new Position(position.getX() + 1, position.getY());
            case WEST: return new Position(position.getX() - 1, position.getY());
            default: throw new IllegalStateException("Invalid direction");
        }
    }

    public void turnLeft() {
        this.direction = direction.turnLeft();
    }

    public void turnRight() {
        this.direction = direction.turnRight();
    }

    public String getStatus() {
        return "Rover is at " + position + " facing " + direction;
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }
}
