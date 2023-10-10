package com.roananik.GOFpatterns.abstracts;

public class Main {
    public static void main(String[] args) {
        TeamFactory fact = new BankingTeamFactory();
        Developer d = fact.getDev();
        Manager m = fact.getManag();
        Tester t = fact.getTester();

        d.writeCode();
        m.managerProject();
        t.testCode();
    }
}
