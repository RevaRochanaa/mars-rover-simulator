import java.util.ArrayList;
import java.util.List;

public class Grid implements GridComponent {
    private int width;
    private int height;
    private List<Obstacle> obstacles;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.obstacles = new ArrayList<>();
    }

    public void addObstacle(Obstacle obstacle) {
        obstacles.add(obstacle);
    }

    @Override
    public boolean isOccupied(Position position) {
        // Check if position is within grid bounds and not occupied by an obstacle
        return false; // Replace with actual implementation
    }
}
