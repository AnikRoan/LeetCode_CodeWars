package com.roananik.GOFpatterns.abstracts;

public class BankingTeamFactory implements TeamFactory {

    @Override
    public Developer getDev() {
        return new JavaDevel();
    }

    @Override
    public Tester getTester() {
        return new Testers();
    }

    @Override
    public Manager getManag() {
        return new MabagerBank();
    }
}
