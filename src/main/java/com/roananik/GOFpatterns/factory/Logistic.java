package com.roananik.GOFpatterns.factory;

public interface Logistic {
    Transport createLogistic();
}
class TruckLogistic implements Logistic{

    @Override
    public Transport createLogistic() {
        return new Truck();
    }
}
class ShipLogistic implements Logistic{

    @Override
    public Transport createLogistic() {
        return new Ship();
    }
}
