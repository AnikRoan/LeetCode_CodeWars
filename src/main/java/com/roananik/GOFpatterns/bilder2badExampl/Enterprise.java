package com.roananik.GOFpatterns.bilder2badExampl;

public class Enterprise extends WebSiteBuilder{
    @Override
    void bildName() {
        webSite.setName("Enterprise");
    }

    @Override
    void bildCms() {
        webSite.setCms(Cms.WORDPRESS);

    }

    @Override
    void bildPrise() {
        webSite.setPrise(300);

    }
}
