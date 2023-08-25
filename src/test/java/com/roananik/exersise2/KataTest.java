package com.roananik.exersise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void evenTests() {
        assertEquals("es", Kata.getMiddle("test"));
        assertEquals("dd", Kata.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", Kata.getMiddle("testing"));
        assertEquals("A", Kata.getMiddle("A"));
    }

    @Test
    public void testRemoval() {
        assertEquals("loquen", Kata.remove("eloquent"));
        assertEquals("ountr", Kata.remove("country"));
        assertEquals("erso", Kata.remove("person"));
        assertEquals("lac", Kata.remove("place"));
    }
}
