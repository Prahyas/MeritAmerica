package com.techelevator;

abstract class Wall {
    private final String name;
    private final String color;

    public Wall(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract int getArea();

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}