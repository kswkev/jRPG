package com.kswkev.jrpg;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @org.junit.jupiter.api.Test
    void getName() {

        String name = "name";
        PlayerCharacter pc = new PlayerCharacter(name);

        assertTrue(pc.getName().equals(name));

    }

    @org.junit.jupiter.api.Test
    void getHitPoints() {

        String name = "name";
        PlayerCharacter pc = new PlayerCharacter(name);

        assertEquals(50, pc.getHitPoints());
    }

    @org.junit.jupiter.api.Test
    void takeDamage() {

        String name = "name";
        PlayerCharacter pc = new PlayerCharacter(name);

        int initialHP = pc.getHitPoints();

        int damage = 20;
        pc.takeDamage(damage);

        assertEquals(initialHP - damage, pc.getHitPoints());

    }

    @org.junit.jupiter.api.Test
    void takeDamageNotDead() {

        String name = "name";
        PlayerCharacter pc = new PlayerCharacter(name);

        int initialHP = pc.getHitPoints();

        int damage = 20;
        pc.takeDamage(damage);

        assertEquals(initialHP - damage, pc.getHitPoints());
        assertFalse(pc.isDead());
    }

    @org.junit.jupiter.api.Test
    void takeDamageIsDead() {

        String name = "name";
        PlayerCharacter pc = new PlayerCharacter(name);

        int damage = 100;
        pc.takeDamage(damage);

        assertEquals(0, pc.getHitPoints());
        assertTrue(pc.isDead());
    }
}