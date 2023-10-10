package com.roananik.GOFpatterns.bilder2badExampl;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }
    WebSite buildWebsite(){
        builder.createWebsite();
        builder.bildName();
        builder.bildCms();
        builder.bildPrise();
        return builder.getWebSite();
    }
}
