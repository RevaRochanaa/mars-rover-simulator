package com.example.marsrover;

import java.util.*;

public class Grid {
    private int width, height;
    private Set<Obstacle> obstacles;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.obstacles = new HashSet<>();
    }

    public void addObstacle(Obstacle obstacle) {
        obstacles.add(obstacle);
    }

    public boolean isValidMove(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height && !isOccupied(x, y);
    }

    public boolean isOccupied(int x, int y) {
        return obstacles.contains(new Obstacle(x, y));
    }

    public void printGrid(Rover rover) {
        for (int y = height - 1; y >= 0; y--) {
            for (int x = 0; x < width; x++) {
                if (x == rover.getX() && y == rover.getY()) {
                    System.out.print("R");
                } else if (obstacles.contains(new Obstacle(x, y))) {
                    System.out.print("X");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}