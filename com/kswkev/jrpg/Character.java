package com.kswkev.jrpg;

public class Character {
    private String name;
    private int hitPoints;
    private boolean isDead;

    public Character(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    public void takeDamage(int damage) {
        this.hitPoints -= damage;
        if (this.hitPoints <= 0) {
            this.hitPoints = 0;
            this.isDead = true;
        }
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public boolean isDead() {
        return isDead;
    }
}
