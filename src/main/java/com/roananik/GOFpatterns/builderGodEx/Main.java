package com.roananik.GOFpatterns.builderGodEx;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder().name("Anna").country("Ua").salary(4000).build();
        System.out.println(person);

    }
}
