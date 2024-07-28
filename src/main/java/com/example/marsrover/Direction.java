package com.example.marsrover;

public enum Direction {
    NORTH(0, 1) {
        public Direction turnLeft() { return WEST; }
        public Direction turnRight() { return EAST; }
    },
    EAST(1, 0) {
        public Direction turnLeft() { return NORTH; }
        public Direction turnRight() { return SOUTH; }
    },
    SOUTH(0, -1) {
        public Direction turnLeft() { return EAST; }
        public Direction turnRight() { return WEST; }
    },
    WEST(-1, 0) {
        public Direction turnLeft() { return SOUTH; }
        public Direction turnRight() { return NORTH; }
    };

    private final int dx, dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public int getDx() { return dx; }
    public int getDy() { return dy; }

    public abstract Direction turnLeft();
    public abstract Direction turnRight();
}