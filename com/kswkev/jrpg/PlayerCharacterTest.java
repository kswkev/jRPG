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
}