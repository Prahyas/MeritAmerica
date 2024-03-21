package com.techelevator;

class TriangleWall extends Wall {
    private final int base;
    private final int height;

    public TriangleWall(String name, String color, int base, int height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public int getArea() {
        return (base * height) / 2;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return getName() + " (" + base + "x" + height + ") triangle";
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}