package com.roananik.GOFpatterns.factory;

public class Main {
    public static void main(String[] args) {
        Logistic log = transport("b");
        Transport d = log.createLogistic();
        d.drive();


    }
   public static Logistic transport(String s){
        if(s.equalsIgnoreCase("a")){
            return  new TruckLogistic();
        }else if(s.equalsIgnoreCase("b")){
            return  new ShipLogistic();
        }else throw new RuntimeException();
    }
}
