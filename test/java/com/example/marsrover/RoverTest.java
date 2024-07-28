package com.example.marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoverTest {
    private Grid grid;
    private Rover rover;

    @BeforeEach
    void setUp() {
        grid = new Grid(10, 10);
        rover = new Rover(0, 0, Direction.NORTH, grid);
    }

    @Test
    void testMove() {
        rover.move();
        assertEquals(0, rover.getX());
        assertEquals(1, rover.getY());
    }

    @Test
    void testTurnLeft() {
        rover.turnLeft();
        assertEquals("Rover is at (0, 0) facing WEST with 95% battery and 20°C temperature", rover.getStatus());
    }

    @Test
    void testTurnRight() {
        rover.turnRight();
        assertEquals("Rover is at (0, 0) facing EAST with 95% battery and 20°C temperature", rover.getStatus());
    }
}