package com.example.marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GridTest {
    private Grid grid;

    @BeforeEach
    void setUp() {
        grid = new Grid(5, 5);
    }

    @Test
    void testIsValidMove() {
        assertTrue(grid.isValidMove(2, 2));
        assertFalse(grid.isValidMove(5, 5));
    }

    @Test
    void testAddObstacle() {
        grid.addObstacle(new Obstacle(2, 2));
        assertFalse(grid.isValidMove(2, 2));
    }
}