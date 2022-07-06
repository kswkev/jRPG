package com.kswkev.jrpg;

public class PlayerCharacter {

    public static final int INITIAL_HIT_POINTS = 50;
    private String name;
    private int hitPoints;

    public PlayerCharacter(String name) {
        this.name = name;
        this.hitPoints = INITIAL_HIT_POINTS;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
