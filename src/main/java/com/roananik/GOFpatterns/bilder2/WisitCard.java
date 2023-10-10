package com.roananik.GOFpatterns.bilder2;

public class WisitCard extends  WebSiteBuilder{
    @Override
    void bildName() {
        webSite.setName("Visit");
    }

    @Override
    void bildCms() {
        webSite.setCms(Cms.ALIFRESCO);

    }

    @Override
    void bildPrise() {
        webSite.setPrise(1000);

    }
}
