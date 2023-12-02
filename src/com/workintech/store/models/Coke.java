package com.workintech.store.models;

public class Coke extends ProductForSale {

    private boolean hasSugar;
    private double size;

    public Coke(String type, double price, String description, boolean hasSugar, double size) {
        super(type, price, description);
        this.hasSugar = hasSugar;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "hasSugar=" + hasSugar +
                ", size=" + size +
                '}';
    }
}
