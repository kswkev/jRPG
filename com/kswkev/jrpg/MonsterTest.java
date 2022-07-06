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
}