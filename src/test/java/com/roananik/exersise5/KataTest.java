package com.roananik.exersise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

  @Test
    public void binNumber(){
      assertEquals("1110",Kata.binaryAddition(5,9));
  }

  @Test
  public void test1() {
    assertEquals(2022, Kata.findNb(4183059834009L));
  }
  @Test

  public void test2() {
    assertEquals(-1, Kata.findNb(24723578342962L));
  }
  @Test
  public void test3() {
    assertEquals(4824, Kata.findNb(135440716410000L));
  }
  @Test
  public void test4() {
    assertEquals(3568, Kata.findNb(40539911473216L));
  }


  @Test
  public void testSomething() {

    assertEquals(15, Kata.sum(new int[]{1,2,3,4,5}));
    assertEquals(13, Kata.sum(new int[]{1,-2,3,4,5}));
    assertEquals(0, Kata.sum(new int[]{}));
    assertEquals(0, Kata.sum(new int[]{-1,-2,-3,-4,-5}));
    assertEquals(9, Kata.sum(new int[]{-1,2,3,4,-5}));
  }

  @Test
  public void on(){
    assertEquals(1, Kata.count("ON"));
  }
  @Test
  public void osIsUpdated(){
    assertEquals(2, Kata.count("OS IS UPDATED"));
  }
  @Test
  public void whoIsWho(){
    assertEquals(2, Kata.count("WHO IS WHO"));
  }
  @Test
  public void js(){
    assertEquals(0, Kata.count("JS"));
  }
  @Test
  public void iIiiIIii(){
    assertEquals(2, Kata.count("I III I III"));
  }
  @Test
  public void empty(){
    assertEquals(0, Kata.count(""));
  }



  @Test
  public void tests() {
    assertEquals(  "camel Casing", Kata.camelCase("camelCasing"));
    assertEquals(  "camel Casing Test", Kata.camelCase("camelCasingTest"));
    assertEquals( "camelcasingtest", Kata.camelCase("camelcasingtest"));
  }
  @Test
  public void test(){
    int[]result = {1,2,3,1,2,3};
    assertArrayEquals(Kata.getConcatenation(new int[]{1,2,3}), result);
  }


}
