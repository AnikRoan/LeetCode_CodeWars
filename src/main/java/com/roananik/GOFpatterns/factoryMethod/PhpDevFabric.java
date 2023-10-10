package com.roananik.GOFpatterns.factoryMethod;

public class PhpDevFabric implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PhpDev();

    }
}
