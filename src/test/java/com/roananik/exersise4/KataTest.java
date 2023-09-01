package com.roananik.exersise4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    @DisplayName("Sample Test Cases")
    void testSomething() {
        assertEquals(12, Kata.sequenceSum( 2,  6, 2), "sequenceSum(2, 6, 2)");
        assertEquals(15, Kata.sequenceSum( 1,  5, 1), "sequenceSum(1, 5, 1)");
        assertEquals( 5, Kata.sequenceSum( 1,  5, 3), "sequenceSum(1, 5, 3)");
        assertEquals(45, Kata.sequenceSum( 0, 15, 3), "sequenceSum(0, 15, 3)");
        assertEquals( 0, Kata.sequenceSum(16, 15, 3), "sequenceSum(16, 15, 3)");
    }

    @Test
    public void fixedTests() {
        assertEquals("HELLO WORLD", Kata.toAlternativeString("hello world"));
        assertEquals("hello world", Kata.toAlternativeString("HELLO WORLD"));
        assertEquals("HELLO world", Kata.toAlternativeString("hello WORLD"));
        assertEquals("hEllO wOrld", Kata.toAlternativeString("HeLLo WoRLD"));
        assertEquals("Hello World", Kata.toAlternativeString(Kata.toAlternativeString("Hello World")));
        assertEquals("12345", Kata.toAlternativeString("12345"));
        assertEquals("1A2B3C4D5E", Kata.toAlternativeString("1a2b3c4d5e"));
        assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", Kata.toAlternativeString("StringUtils.toAlternatingCase"));
    }

    @Test
    public void kataTitleTests() {
        assertEquals("ALTerNAtiNG CaSe", Kata.toAlternativeString("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", Kata.toAlternativeString("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", Kata.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", Kata.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }


    @Test
    public void test() {
        assertEquals(811181, new Kata().squareDigits(9119));
        assertEquals(0, new Kata().squareDigits(0));
    }


    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, Kata.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, Kata.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, Kata.sortArray(new int[]{}));
    }




}
