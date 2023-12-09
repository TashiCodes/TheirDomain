package org.characters;

import org.logic.MathOperation;

public class Character {
    private String name;
    private int healthPoints;
    private int level;
    private int experience;

    private Inventory inventory;

//constructors
    public Character(String name, int smallestHealthPoints, int largestHealthPoints) {
        this.name = name;
        this.healthPoints = MathOperation.getRandomNumber(smallestHealthPoints,largestHealthPoints);
        this.level = 0;
        this.experience = 0;
        this.inventory = new Inventory();
    }
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
