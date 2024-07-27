import java.util.List;

public class RoverController {
    private Rover rover;
    private Grid grid;

    public RoverController(Rover rover, Grid grid) {
        this.rover = rover;
        this.grid = grid;
    }

    public void executeCommands(List<Command> commands) {
        for (Command command : commands) {
            command.execute(rover);
            // Add logic to check for obstacles and grid boundaries
        }
    }
}
