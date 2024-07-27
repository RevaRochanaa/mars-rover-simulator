public class Obstacle implements GridComponent {
    private Position position;

    public Obstacle(Position position) {
        this.position = position;
    }

    @Override
    public boolean isOccupied(Position position) {
        return this.position.equals(position);
    }
}
