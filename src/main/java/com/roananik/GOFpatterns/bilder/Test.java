package com.roananik.GOFpatterns.bilder;

public class Test {
    public static void main(String[] args) {
        Car car = Car.builder()

                .age(22).build();
        System.out.println(car);
    }
}
