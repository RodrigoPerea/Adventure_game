package com.company;

public class Item {

    private String name;
    private String description;
    private int quantity;




    public Item(String name,String description, int quantity) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public String toString() {
        return name + " " + description;

    }
}
