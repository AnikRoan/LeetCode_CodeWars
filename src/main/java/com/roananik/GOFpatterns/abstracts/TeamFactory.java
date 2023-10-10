package com.roananik.GOFpatterns.abstracts;

public interface TeamFactory {
    Developer getDev();
    Tester getTester();
    Manager getManag();
}
