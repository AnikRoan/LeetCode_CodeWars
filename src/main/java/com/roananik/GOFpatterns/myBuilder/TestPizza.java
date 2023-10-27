package com.roananik.GOFpatterns.myBuilder;

public class TestPizza {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.CreatePizza().size(22).build();
        System.out.println(pizza);
     //  Pizza pizza1 = new Pizza();

    }
}
