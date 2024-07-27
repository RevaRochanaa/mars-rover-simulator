public class CommandFactory {
    public static Command createCommand(char commandChar) {
        switch (commandChar) {
            case 'M':
                return new MoveCommand();
            case 'L':
                return new TurnLeftCommand();
            case 'R':
                return new TurnRightCommand();
            default:
                throw new IllegalArgumentException("Unknown command: " + commandChar);
        }
    }
}
