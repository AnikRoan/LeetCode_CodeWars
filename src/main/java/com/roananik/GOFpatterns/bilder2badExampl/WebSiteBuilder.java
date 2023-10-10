package com.roananik.GOFpatterns.bilder2badExampl;

public abstract class WebSiteBuilder {
    WebSite webSite;

    void createWebsite(){
        webSite = new WebSite();

    }
    abstract void bildName();
    abstract void bildCms();
    abstract void bildPrise();

    WebSite getWebSite(){
        return webSite;
    }
}
