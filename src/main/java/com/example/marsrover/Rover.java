package com.example.marsrover;

public class Rover {
    private int x, y;
    private Direction direction;
    private Grid grid;
    private int batteryLevel;
    private int temperature;

    public Rover(int x, int y, Direction direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
        this.batteryLevel = 100;
        this.temperature = 20;
    }

    public void move() {
        if (batteryLevel > 0) {
            int newX = x + direction.getDx();
            int newY = y + direction.getDy();
            if (grid.isValidMove(newX, newY)) {
                x = newX;
                y = newY;
                batteryLevel -= 10;
                temperature += 5;
                System.out.println("Rover moved to (" + x + ", " + y + ")");
            } else {
                System.out.println("Move blocked by obstacle or grid boundary");
            }
        } else {
            System.out.println("Rover out of battery");
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();
        batteryLevel -= 5;
        System.out.println("Rover turned left, now facing " + direction);
    }

    public void turnRight() {
        direction = direction.turnRight();
        batteryLevel -= 5;
        System.out.println("Rover turned right, now facing " + direction);
    }

    public String getStatus() {
        return "Rover is at (" + x + ", " + y + ") facing " + direction + " with " + batteryLevel + "% battery and " + temperature + "°C temperature";
    }

    // Getters for x and y coordinates
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}