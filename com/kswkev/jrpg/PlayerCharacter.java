package com.kswkev.jrpg;

public class PlayerCharacter extends Character {

    public static final int INITIAL_HIT_POINTS = 50;

    public PlayerCharacter(String name) {
        super(name, INITIAL_HIT_POINTS);
    }

}
