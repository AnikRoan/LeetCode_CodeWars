package com.roananik.GOFpatterns.bilder2;

public class RunWebSite {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new Enterprise());

        WebSite webSite= director.buildWebsite();

        System.out.println(webSite);
    }
}
