package com.example.marsrover;

import java.util.*;

public class MarsRoverSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get grid dimensions
            System.out.print("Enter grid width: ");
            int width = scanner.nextInt();
            System.out.print("Enter grid height: ");
            int height = scanner.nextInt();
            Grid grid = new Grid(width, height);

            // Get rover starting position and direction
            System.out.print("Enter starting x position: ");
            int startX = scanner.nextInt();
            System.out.print("Enter starting y position: ");
            int startY = scanner.nextInt();
            System.out.print("Enter starting direction (NORTH, EAST, SOUTH, WEST): ");
            String directionStr = scanner.next();
            Direction direction = Direction.valueOf(directionStr);
            
            Rover rover = new Rover(startX, startY, direction, grid);
            
            // Add obstacles
            System.out.print("Enter number of obstacles: ");
            int numObstacles = scanner.nextInt();
            for (int i = 0; i < numObstacles; i++) {
                System.out.print("Enter x position of obstacle " + (i + 1) + ": ");
                int obstacleX = scanner.nextInt();
                System.out.print("Enter y position of obstacle " + (i + 1) + ": ");
                int obstacleY = scanner.nextInt();
                grid.addObstacle(new Obstacle(obstacleX, obstacleY));
            }
            
            // Print initial grid state
            System.out.println("Initial grid state:");
            grid.printGrid(rover);
            
            // Get and execute commands
            System.out.print("Enter commands (M to move, L to turn left, R to turn right): ");
            String commands = scanner.next();
            
            for (char command : commands.toCharArray()) {
                Command cmd = null;
                switch (command) {
                    case 'M':
                        cmd = new MoveCommand();
                        break;
                    case 'L':
                        cmd = new TurnLeftCommand();
                        break;
                    case 'R':
                        cmd = new TurnRightCommand();
                        break;
                    default:
                        System.out.println("Invalid command: " + command);
                        continue;
                }
                cmd.execute(rover);
            }
            
            // Print final grid state and rover status
            System.out.println("Final grid state:");
            grid.printGrid(rover);
            System.out.println("Rover final status: " + rover.getStatus());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values where expected.");
        } catch (NoSuchElementException e) {
            System.out.println("Unexpected end of input. Please check your input.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please check your direction or weather values.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}