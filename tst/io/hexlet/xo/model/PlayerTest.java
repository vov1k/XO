package io.hexlet.xo.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testGetName() throws Exception {
        final String testValue = "Slava";
        final String expectedValue = testValue;
        final Player player = new Player(testValue, null);

        final String actialValue = player.getName();
        assertEquals(expectedValue, actialValue);
    }

    @Test
    public void testGetFigure() throws Exception {

    }
}