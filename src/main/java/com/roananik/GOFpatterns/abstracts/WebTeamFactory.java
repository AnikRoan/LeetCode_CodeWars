package com.roananik.GOFpatterns.abstracts;

public class WebTeamFactory implements TeamFactory {
    @Override
    public Developer getDev() {
        return new PhpDev();
    }

    @Override
    public Tester getTester() {
        return new QaTester();
    }

    @Override
    public Manager getManag() {
        return new WebManager();
    }
}
