import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        Rover rover = new Rover(new Position(0, 0), Direction.NORTH);
        RoverController controller = new RoverController(rover, grid);

        List<Command> commands = new ArrayList<>();
        commands.add(new MoveCommand());
        commands.add(new TurnRightCommand());
        commands.add(new MoveCommand());

        controller.executeCommands(commands);
        System.out.println(rover.getStatus());
    }
}
