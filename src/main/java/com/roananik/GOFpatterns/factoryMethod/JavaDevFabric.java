package com.roananik.GOFpatterns.factoryMethod;

public class JavaDevFabric implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDev();

    }
}
