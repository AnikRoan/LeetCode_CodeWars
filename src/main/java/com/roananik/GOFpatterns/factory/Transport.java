package com.roananik.GOFpatterns.factory;

public interface Transport {
    void drive();
}
class Truck implements Transport{

    @Override
    public void drive() {
        System.out.println("drive");
    }
}
class Ship implements Transport{

    @Override
    public void drive() {
        System.out.println("swim");

    }
}
