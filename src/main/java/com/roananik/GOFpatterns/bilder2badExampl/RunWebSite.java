package com.roananik.GOFpatterns.bilder2badExampl;

public class RunWebSite {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new WisitCard());

        WebSite webSite= director.buildWebsite();

        System.out.println(webSite);
    }
}
