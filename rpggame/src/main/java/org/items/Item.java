package org.items;

public class Item {
    private String name;
    private String description;
    private int weight;
    private boolean isEquipped;

    public Item(String name, String description, int weight) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.isEquipped = false;
    }
}
