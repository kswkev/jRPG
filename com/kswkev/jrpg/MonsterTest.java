package com.kswkev.jrpg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonsterTest {

    @Test
    void getName() {

        String name = "bat";
        int hitPoints = 25;
        Monster monster = new Monster(name, hitPoints);

        assertTrue(monster.getName().equals(name));
    }

    @Test
    void getHitPoints() {

        String name = "bat";
        int hitPoints = 25;
        Monster monster = new Monster(name, hitPoints);

        assertEquals(hitPoints, monster.getHitPoints());
    }

    @org.junit.jupiter.api.Test
    void takeDamage() {

        String name = "bat";
        int hitPoints = 25;
        Monster monster = new Monster(name, hitPoints);


        int damage = 20;
        monster.takeDamage(damage);

        assertEquals(hitPoints - damage, monster.getHitPoints());

    }

    @org.junit.jupiter.api.Test
    void takeDamageNotDead() {

        String name = "bat";
        int hitPoints = 25;
        Monster monster = new Monster(name, hitPoints);

        int initialHP = monster.getHitPoints();

        int damage = 20;
        monster.takeDamage(damage);

        assertEquals(initialHP - damage, monster.getHitPoints());
        assertFalse(monster.isDead());
    }

    @org.junit.jupiter.api.Test
    void takeDamageIsDead() {

        String name = "bat";
        int hitPoints = 25;
        Monster monster = new Monster(name, hitPoints);

        int damage = 100;
        monster.takeDamage(damage);

        assertEquals(0, monster.getHitPoints());
        assertTrue(monster.isDead());
    }
}