package com.techelevator;

public class MediaItem {
    private String title;
    private double price;

    public MediaItem(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public MediaItem() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
