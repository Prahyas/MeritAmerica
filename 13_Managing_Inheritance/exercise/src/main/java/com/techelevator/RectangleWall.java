package com.techelevator;

class RectangleWall extends Wall {
    private final int length;
    private final int height;

    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }

    @Override
    public int getArea() {
        return length * height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return getName() + " (" + length + "x" + height + ") rectangle";
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}