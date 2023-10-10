package com.roananik.GOFpatterns.builderGodEx;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder().setAge(22).build();
        System.out.println(person);
    }
}
