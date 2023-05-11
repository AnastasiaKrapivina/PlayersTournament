package ru.netology.project;

public class Player {
    protected int id;
    protected String name;
    protected int strength;  // сила

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int newStrength) {
        this.strength = newStrength;
    }
}
