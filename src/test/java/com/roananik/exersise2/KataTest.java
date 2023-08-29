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

    @Test
    public void testBob() {
        assertEquals( 0, Kata.enough(10, 5, 5));
        assertEquals( 10, Kata.enough(100, 60, 50));
        assertEquals( 0, Kata.enough(20, 5, 5));
    }


    @Test
    public void findShort() throws Exception {
        assertEquals(3, Kata.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, Kata.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, Kata.findShort("Let's travel abroad shall we"));
    }


    @Test
    public void testSum() {
        assertEquals(0,      Kata.sum(new double[] { }),                1e-4);
        assertEquals(-2.398, Kata.sum(new double[] {-2.398}),           1e-4);
        assertEquals(6,      Kata.sum(new double[] {1, 2, 3}),          1e-4);
        assertEquals(6.6,    Kata.sum(new double[] {1.1, 2.2, 3.3}),    1e-4);
        assertEquals(9.2,    Kata.sum(new double[] {1, 5.2, 4, 0, -1}), 1e-4);
        assertEquals(320,    Kata.sum(new double[] {30, 89, 100, 101}), 1e-4);
    }

    @Test
    public void example1(){
        int expected = 11;
        int actual = Kata.findSmallestInt(new int[]{78,56,232,12,11,43});
        assertEquals(expected, actual);
    }


    @Test
    public void example2(){
        int expected = -33;
        int actual = Kata.findSmallestInt(new int[]{78,56,-2,12,8,-33});
        assertEquals(expected, actual);
    }

    @Test
    public void example3(){
        int expected = Integer.MIN_VALUE;
        int actual = Kata.findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE});
        assertEquals(expected, actual);
    }

}
