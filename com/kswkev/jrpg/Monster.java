package com.kswkev.jrpg;

public class Monster {

    private String name;
    private int hitPoints;

    public Monster(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
